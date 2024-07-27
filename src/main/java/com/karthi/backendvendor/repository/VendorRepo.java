package com.karthi.backendvendor.repository;

import java.util.List;

import com.karthi.backendvendor.model.Vendor;

public interface VendorRepo {
	public void save(Vendor vendor);
	
	public void update(Vendor vendor);
	
	public List<Vendor> findAll();
	
	public Vendor findById(int id);
	
	public void deleteById(int id);
}
