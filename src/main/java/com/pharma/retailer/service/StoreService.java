package com.pharma.retailer.service;

import java.util.List;

import com.pharma.retailer.dto.RetailerDto;
import com.pharma.retailer.dto.StoreDto;

public interface StoreService {

	public void createStore(StoreDto storeDto);

	public void updateStore(StoreDto storeDto);

	public void deleteStore(long staffCode);

	public StoreDto findByStoreCode(long storeCode);
	
	List<RetailerDto> retailerAheadSearch(String query);

}
