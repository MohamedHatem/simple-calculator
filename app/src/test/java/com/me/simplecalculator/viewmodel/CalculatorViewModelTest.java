package com.me.simplecalculator.viewmodel;

import android.databinding.ObservableField;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

/**
 * Created by xvbp3947 on 17/11/18.
 */

@RunWith(MockitoJUnitRunner.class)
public class CalculatorViewModelTest {

    private CalculatorViewModel calViewModel;

    @Before
    public void setUp() throws Exception {
        calViewModel = new CalculatorViewModel();
    }


    @Test
    public void addition_isCorrect() {
        // Trigger
        calViewModel.onButtonClicked("1");
        calViewModel.onButtonClicked("+");
        calViewModel.onButtonClicked("2");
        calViewModel.onButtonClicked("=");
        Assert.assertEquals("3.0", calViewModel.result.get());
    }
}
