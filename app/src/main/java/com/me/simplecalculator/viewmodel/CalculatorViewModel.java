package com.me.simplecalculator.viewmodel;

import android.databinding.ObservableField;

import com.me.simplecalculator.model.Calculator;

/**
 * Created by xvbp3947 on 17/11/18.
 */

public class CalculatorViewModel implements CalculatorViewModelContract {

    public final ObservableField<String> result = new ObservableField<>();
    public final ObservableField<String> mathExpInfo = new ObservableField<>();

    Calculator model;


    public CalculatorViewModel() {
        this.model = new Calculator();
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

        result.set(model.getResult());
        mathExpInfo.set(model.getMathExperssionInfo());
    }
}
