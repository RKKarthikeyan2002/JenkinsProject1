package com.karthi.backendvendor.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.backendvendor.model.Vendor;
import com.karthi.backendvendor.serviceimpli.VendorServiceImpli;

@RestController
@RequestMapping("/vendor")
@CrossOrigin("http://localhost:3000/")
public class VendorController {
	VendorServiceImpli vendorServiceImpli;

	public VendorController(VendorServiceImpli vendorServiceImpli) {
		super();
		this.vendorServiceImpli = vendorServiceImpli;
	}
	
	@PostMapping
	public void createVendor(@RequestBody Vendor vendor) {
		vendorServiceImpli.addVendor(vendor);
	}

	@PutMapping
	public void editVendor(@RequestBody Vendor vendor) {
		vendorServiceImpli.updateVendor(vendor);
	}

	@GetMapping("all")
	public List<Vendor> getAllVendors() {
		return vendorServiceImpli.findAllVendors();
	}

	@GetMapping("{id}")
	public Vendor getVendorById(@PathVariable int id) {
		return vendorServiceImpli.findVendorById(id);
	}

	@DeleteMapping("{id}")
	public void deleteVendor(@PathVariable int id) {
		vendorServiceImpli.deleteVendorById(id);
	}
}
