package com.cognizant.ormlearn.service.Implementation;

import com.cognizant.ormlearn.service.StockService;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Transactional
@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository stockRepository;

	@Override
	public List<Stock> getAllStockDetails() {

		return stockRepository.findAll();
	}

	@Override
	public List<Stock> findStockUsingCode(String code) {

		return stockRepository.findStockByCode(code);
	}

	@Override
	public List<Stock> findFBStockInSep19(String code, Date startDate, Date endDate) {

		return stockRepository.fbStockInSep19(code, startDate, endDate);
	}

	@Override
	public List<Stock> findGoogleStockGreaterThan1250(String code, double price) {

		return stockRepository.googleStocks(code, price);
	}

	@Override
	public List<Stock> findTop3VolumeStock() {

		return stockRepository.topVolume();
	}

	@Override
	public List<Stock> findLowest3NetflixStocks(String code) {
		
		return stockRepository.lowNetflixStocks(code);
	}
}
