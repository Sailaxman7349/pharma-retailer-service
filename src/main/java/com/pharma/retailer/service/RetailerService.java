package com.pharma.retailer.service;

import java.util.List;

import com.pharma.retailer.dto.RetailerDto;
import com.pharma.retailer.dto.StoreDto;

public interface RetailerService {

	public void createRetailer(RetailerDto retailerDto);

	public void updateRetailer(RetailerDto retailerDto);

	public void deleteRetailer(long retailerCode);

	public RetailerDto findByRetailerCode(long retailerCode);

	public List<StoreDto> storeAheadSearch(String searchQuery);

}
