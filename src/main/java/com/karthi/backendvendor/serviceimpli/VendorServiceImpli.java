package com.karthi.backendvendor.serviceimpli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.karthi.backendvendor.model.Vendor;
import com.karthi.backendvendor.repository.VendorRepo;
import com.karthi.backendvendor.service.VendorService;

@Service
public class VendorServiceImpli implements VendorService {
	VendorRepo vRepo;

	public VendorServiceImpli(VendorRepo vRepo) {
		super();
		this.vRepo = vRepo;
	}

	@Override
	public void addVendor(Vendor vendor) {
		vRepo.save(vendor);
	}

	@Override
	public void updateVendor(Vendor vendor) {
		vRepo.update(vendor);
	}

	@Override
	public List<Vendor> findAllVendors() {
		return vRepo.findAll();
	}

	@Override
	public Vendor findVendorById(int id) {
		return vRepo.findById(id);
	}

	@Override
	public void deleteVendorById(int id) {
		vRepo.deleteById(id);
	}

}
