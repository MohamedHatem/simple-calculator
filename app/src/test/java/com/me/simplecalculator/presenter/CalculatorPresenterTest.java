package com.me.simplecalculator.presenter;

import com.me.simplecalculator.model.Calculator;
import com.me.simplecalculator.view.CalculatorViewContract;

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
public class CalculatorPresenterTest {

    private CalculatorPresenter calPresenter;

    @Mock
    private Calculator model;

    @Mock
    private CalculatorViewContract viewContract;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        calPresenter = Mockito.spy(new CalculatorPresenter(viewContract));
    }

    @Test
    public void funcInvokes_isCorrect() {

        // Trigger
        calPresenter.onButtonClicked("1");
        calPresenter.onButtonClicked("+");
        calPresenter.onButtonClicked("2");
        calPresenter.onButtonClicked("=");

        // Validation
        Mockito.verify(viewContract, Mockito.times(4)).showResult(any(String.class));
    }

    // TODO : this test case is not right and needed to be fixed
    @Test
    public void addition_isCorrect() {

        // Trigger
        calPresenter.onButtonClicked("1");
        // Validation
        Mockito.verify(viewContract).showResult("1");
        calPresenter.onButtonClicked("+");
        calPresenter.onButtonClicked("2");
        Mockito.verify(viewContract).showResult("2");

        calPresenter.onButtonClicked("=");
        Mockito.verify(viewContract).showResult("3");


    }
}
