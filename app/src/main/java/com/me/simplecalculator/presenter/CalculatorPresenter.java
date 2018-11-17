package com.me.simplecalculator.presenter;

import android.view.View;
import android.widget.Button;

import com.me.simplecalculator.model.Calculator;
import com.me.simplecalculator.view.CalculatorView;

/**
 * Created by xvbp3947 on 17/11/18.
 */

public class CalculatorPresenter implements CalPresenter {

    CalculatorView view;
    Calculator model;


    public CalculatorPresenter(CalculatorView view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        model = new Calculator();
    }

    public void onButtonClicked(String tag) {
        boolean isOp = tag.equalsIgnoreCase("+") || tag.equalsIgnoreCase("-") ||
                tag.equalsIgnoreCase("*") || tag
                .equalsIgnoreCase("/");

        boolean isEqual = tag.equalsIgnoreCase("=");
        boolean isClear = tag.equalsIgnoreCase("c");

        if (isEqual) {
            model.calcTheResult();
        } else if (isOp) {
            model.enterTheOperation(tag);
        } else if (isClear) {
            model.clear();
        } else {
            model.enterNewDigit(tag);
        }


        view.showExperssion(model.getMathExperssionInfo());
        view.showResult(model.getResult());
    }
}
