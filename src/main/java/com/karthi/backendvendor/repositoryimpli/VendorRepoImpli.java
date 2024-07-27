package com.karthi.backendvendor.repositoryimpli;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.karthi.backendvendor.model.Vendor;
import com.karthi.backendvendor.repository.VendorRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VendorRepoImpli implements VendorRepo {

	EntityManager eManager;

	public VendorRepoImpli(EntityManager eManager) {
		super();
		this.eManager = eManager;
	}

	@Override
	public void save(Vendor vendor) {
		eManager.persist(vendor);
	}

	@Override
	public void update(Vendor vendor) {
		eManager.merge(vendor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vendor> findAll() {
		String hql = "From Vendor";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Vendor findById(int id) {
		return eManager.find(Vendor.class, id);
	}

	@Override
	public void deleteById(int id) {
		Vendor vendor = eManager.find(Vendor.class, id);
		eManager.remove(vendor);
	}

}
