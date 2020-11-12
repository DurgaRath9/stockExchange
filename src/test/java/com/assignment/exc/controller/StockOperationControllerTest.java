package com.assignment.exc.controller;

import com.assignment.exc.model.Share;
import com.assignment.exc.service.StockOperationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class StockOperationControllerTest {

    @InjectMocks
    private StockOperationController stockOperationController;
    @Mock
    private StockOperationService stockOperationService;

    @Test
    public void should_get_all_stock(){
        List<Share> shares = new ArrayList<>();
        Share share = new Share();
        share.setShareId("testId");
        shares.add(share);
        Mockito.when(stockOperationService.getAllShares()).thenReturn(shares);
        ResponseEntity allShares = stockOperationController.getAllShares();
        assertThat(allShares).isNotNull();

    }
}