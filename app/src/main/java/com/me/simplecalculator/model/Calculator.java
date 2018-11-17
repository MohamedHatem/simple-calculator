package com.me.simplecalculator.model;

import com.me.simplecalculator.Utils.MathCalculator;

/**
 * Created by xvbp3947 on 17/11/18.
 */

public class Calculator {

    private Double valueOne;
    private Double valueTwo;
    private Operation currOperation;

    private String result;
    private String mathExperssionInfo = "";

    public Calculator() {
        clear();
    }


    /**
     * when enter new digit from the calculator layout
     *
     * @param digit
     */
    public void enterNewDigit(String digit) {
        mathExperssionInfo += digit;
        result += digit;
    }

    public void enterTheOperation(String opStr) {

        if (opStr.equalsIgnoreCase("+")) {
            currOperation = Operation.ADD;
        } else if (opStr.equalsIgnoreCase("-")) {
            currOperation = Operation.SUB;
        } else if (opStr.equalsIgnoreCase("*")) {
            currOperation = Operation.MULT;
        } else if (opStr.equalsIgnoreCase("/")) {
            currOperation = Operation.DIV;
        }

        valueOne = Double.valueOf(result);
        result = "";
        mathExperssionInfo += " " + opStr + " ";
    }

    /**
     * when the user press equal
     */
    public void calcTheResult() {

        valueTwo = Double.valueOf(result);
        result = "";

        switch (currOperation) {
            case ADD:
                result = String.valueOf(MathCalculator.add(valueOne, valueTwo));
                break;
            case SUB:
                result = String.valueOf(MathCalculator.sub(valueOne, valueTwo));
                break;
            case DIV:
                result = String.valueOf(MathCalculator.div(valueOne, valueTwo));
                break;
            case MULT:
                result = String.valueOf(MathCalculator.mult(valueOne, valueTwo));
                break;
        }

        mathExperssionInfo += " = " + result;
    }

    /**
     * to clear the current operation and start a new one
     */
    public void clear() {
        valueOne = Double.NaN;
        valueTwo = Double.NaN;
        currOperation = Operation.NO;
        result = "";
        mathExperssionInfo = "";
    }

    public String getResult() {
        return result;
    }

    public String getMathExperssionInfo() {
        return mathExperssionInfo;
    }
}
