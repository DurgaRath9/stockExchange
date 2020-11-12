package com.assignment.exc.repository;

import com.assignment.exc.model.Share;
import com.assignment.exc.model.ShareDetails;
import com.assignment.exc.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for storing and retrieving data.
 * Currently we are storing data in Map instead of connecting to DB.
 */
@Service
public class StockOperationRepository {
    public static final Logger logger = LoggerFactory.getLogger(StockOperationRepository.class);


    public List<Share> getAllShares() {

//        Share hdfcShare = new Share("1", Constants.OPEN,Constants.);
       

        List<Share> shares = new ArrayList<>();

        return shares;
    }
}
