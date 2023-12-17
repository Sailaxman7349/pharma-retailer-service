package com.pharma.retailer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.retailer.dto.RetailerDto;
import com.pharma.retailer.dto.StoreDto;
import com.pharma.retailer.service.RetailerService;

import jakarta.validation.Valid;

@Validated
@RestController
@RequestMapping("/api/retailer/v1/")
public class RetailerController {

	@Autowired
	private RetailerService retailerService;

	@PostMapping("/create")
	public void createRetailer(@Valid @RequestBody RetailerDto retailerDto) {
		retailerService.createRetailer(retailerDto);
	}

	@PostMapping("/update")
	public void updateRetailer(@Valid @RequestBody RetailerDto retailerDto) {
		retailerService.updateRetailer(retailerDto);
	}

	@DeleteMapping("/delete")
	public void deleteRetailer(@RequestParam long retailerCode) {
		retailerService.deleteRetailer(retailerCode);
	}

	@GetMapping("/findByCode/{retailerCode}")
	public RetailerDto findByRetailerCode(@PathVariable long retailerCode) {
		return retailerService.findByRetailerCode(retailerCode);
	}

	@GetMapping("/search")
	public List<StoreDto> retailerAheadSearch(@RequestParam("searchQuery") String searchQuery) {
		return retailerService.storeAheadSearch(searchQuery);
	}

}