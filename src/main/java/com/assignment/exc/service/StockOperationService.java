package com.assignment.exc.service;

import com.assignment.exc.model.Share;
import com.assignment.exc.repository.StockOperationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockOperationService {
    public static final Logger logger = LoggerFactory.getLogger(StockOperationService.class);

    @Autowired
    StockOperationRepository stockOperationRepository;

    public List<Share> getAllShares() {
       return stockOperationRepository.getAllShares();
    }

    public Share getShareById(String id) {
       return stockOperationRepository.getAllShares().stream().filter( s -> s.getShareId().equals(id)).findFirst().get();
    }

    public Share getShareByName(String name) {
        return stockOperationRepository.getAllShares().stream().filter( s -> s.getShareDetails().getDisplayName().equals(name)).findFirst().get();
    }

	public Share getRecommendation() {
		// TODO Auto-generated method stub
		
		return stockOperationRepository.getRecommendation();
	}
}
