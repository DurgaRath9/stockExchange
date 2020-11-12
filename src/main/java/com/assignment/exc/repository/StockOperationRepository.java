package com.assignment.exc.repository;

import com.assignment.exc.model.Share;
import com.assignment.exc.model.ShareDetails;
import com.assignment.exc.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

        Share hdfcShare = new Share("1", Constants.OPEN,"9.00","3.00","5:00 PM IST","8:00 AM IST",new ShareDetails("1","HDFC","HDFC BANK Co.","MUTUAL FUND","9.00","8.50","9.00","270",Constants.UP,"30"));

        Share iciciShare = new Share("2", Constants.OPEN,"8.00","5.00","5:00 PM IST","8:00 AM IST",new ShareDetails("2","ICICI","ICIC BANK Co.","EQUITY","6.00","6.50","6.00","90",Constants.UP,"9"));

        Share wppShare = new Share("3", Constants.OPEN,"8.00","5.00","5:00 PM IST","8:00 AM IST",new ShareDetails("3","WPP","Wunderman Thompson","DVR","12.00","10.00","12.00","30",Constants.UP,"3"));

        Share maerskShare = new Share("4", Constants.CLOSED,"15.00","5.00","5:00 PM IST","8:00 AM IST",new ShareDetails("4","MARESK","MAERSK Line","EQUITY","5.00","15.00","5.00","300",Constants.DOWN,"90"));

        Share hwShare = new Share("5", Constants.OPEN,"18.00","9.00","5:00 PM IST","8:00 AM IST",new ShareDetails("5","HW","HW Ltd.","EQUITY","18.00","17.00","18.00","20",Constants.UP,"10"));

        List<Share> shares = new ArrayList<>();
        shares.add(hdfcShare);
        shares.add(iciciShare);
        shares.add(wppShare);
        shares.add(maerskShare);
        shares.add(hwShare);

        return shares;
    }
}
