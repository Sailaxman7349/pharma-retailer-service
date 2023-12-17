package com.pharma.retailer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.retailer.dto.RetailerDto;
import com.pharma.retailer.dto.StoreDto;
import com.pharma.retailer.service.StoreService;

import jakarta.validation.Valid;

@Validated
@RestController
@RequestMapping("api/retailer/v1/store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@PostMapping("/create")
	public void createStore(@Valid @RequestBody StoreDto storeDto) {
		storeService.createStore(storeDto);
	}

	@PutMapping("/update")
	public void updateStore(@Valid @RequestBody StoreDto storeDto) {
		storeService.updateStore(storeDto);
	}

	@DeleteMapping("/delete")
	public void deleteStore(@RequestParam long storeCode) {
		storeService.deleteStore(storeCode);
	}

	@GetMapping("/findByStoreCode/{storeCode}")
	public StoreDto findByStoreCode(@PathVariable long storeCode) {
		return storeService.findByStoreCode(storeCode);
	}

	@GetMapping("/search")
	public List<RetailerDto> retailerAheadSearch(@RequestParam("query") String query) {
		return storeService.retailerAheadSearch(query);
	}
}
