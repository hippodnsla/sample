package com.nustar.framework.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Selection;

import org.springframework.util.Assert;

import com.nustar.framework.core.entity.Entity;

public abstract class AbstractJPADAO <E extends Entity> implements DAO<E> {

	protected AbstractJPADAO() {
		super();
	}
	
	public E get(long id) {
		return getEntityManager().find(getClazz(), id);
	}
	
	@SuppressWarnings("unchecked")
	public List<E> getAll() {
		CriteriaQuery<E> cq = getEntityManager().getCriteriaBuilder().createQuery(getClazz());
		cq.select(cq.from(getClazz()));
		Query q = getEntityManager().createQuery(cq);
		return (List<E>) q.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<E> getRange(int begin, int end) {
		CriteriaQuery<E> cq = getEntityManager().getCriteriaBuilder().createQuery(getClazz());
		cq.select(cq.from(getClazz()));
		Query q = getEntityManager().createQuery(cq);
		q.setMaxResults(end-begin);
		q.setFirstResult(begin);
		return (List<E>) q.getResultList();
	}
	
	public void save(E... entities) {
		Assert.notNull(entities);
		switch(entities.length) {
		case 0:
			return;
		case 1:
			save(entities[0]);
		default:
			//TODO: Low performance solution, to be re-fact
			for (E e: entities)
				save(e);
		}
	}
	
	public void update(E... entities) {
		Assert.notNull(entities);
		switch(entities.length) {
		case 0:
			return;
		case 1:
			update(entities[0]);
		default:
			//TODO: Low performance solution, to be re-fact
			for (E e: entities)
				update(e);
		}
	}
	
	public void delete(E... entities) {
		Assert.notNull(entities);
		switch(entities.length) {
		case 0:
			return;
		case 1:
			delete(entities[0]);
		default:
			//TODO: Low performance solution, to be re-fact
			for (E e: entities)
				delete(e);
		}
	}
	
	public boolean exist(E... entities) {
		Assert.notNull(entities);
		switch(entities.length) {
		case 0:
			return true;
		case 1:
			return exist(entities[0]);
		default:
			//TODO: Low performance solution, to be re-fact
			for (E e: entities)
				if (!exist(e))
					return false;
			return true;
		}
	}
	
	@SuppressWarnings("unchecked")
	public int size() {
		CriteriaBuilder qb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<E> cq = getEntityManager().getCriteriaBuilder().createQuery(getClazz());
		cq.select((Selection<? extends E>) qb.count(cq.from(getClazz())));
		Query q = getEntityManager().createQuery(cq);
		return ((Long) q.getSingleResult()).intValue();
	}
	
	protected abstract EntityManager getEntityManager();
	
	protected abstract Class<E> getClazz();

	private void save(E entity) {
		Assert.notNull(entity);
		Assert.state(entity.getId() != 0);
		if (getEntityManager().contains(entity))
			getEntityManager().merge(entity);
		else
			getEntityManager().persist(entity);
	}
	
	private void delete(E entity) {
		Assert.notNull(entity);
		Assert.state(entity.getId() != 0);
		E e = getEntityManager().merge(entity);
		getEntityManager().remove(e);
	}
	
	private void update(E entity) {
		Assert.notNull(entity);
		Assert.state(entity.getId() != 0);
		getEntityManager().refresh(entity);
	}
	
	private boolean exist(E entity) {
		return getEntityManager().contains(entity);
	}
}
