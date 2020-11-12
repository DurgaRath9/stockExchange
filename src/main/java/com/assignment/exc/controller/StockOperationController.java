package com.assignment.exc.controller;

import com.assignment.exc.service.StockOperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockOperationController {

    public static final Logger logger = LoggerFactory.getLogger(StockOperationController.class);

    @Autowired
    StockOperationService stockOperationService;

    @GetMapping("shares/v1/allShares")
    public ResponseEntity getAllShares(){
        return ResponseEntity.status(HttpStatus.OK).body(stockOperationService.getAllShares());
    }


}
