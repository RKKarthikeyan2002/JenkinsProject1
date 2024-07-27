package com.karthi.backendvendor.service;

import java.util.List;

import com.karthi.backendvendor.model.Vendor;

public interface VendorService {
	public void addVendor(Vendor vendor);
	
	public void updateVendor(Vendor vendor);
	
	public List<Vendor> findAllVendors();
	
	public Vendor findVendorById(int id);
	
	public void deleteVendorById(int id);
}
