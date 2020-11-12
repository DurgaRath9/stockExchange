package com.assignment.exc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * This class is used for storing and retrieving data.
 * Currently we are storing data in Map instead of connecting to DB.
 */
@Service
public class StockOperationRepository {
    public static final Logger logger = LoggerFactory.getLogger(StockOperationRepository.class);


}
