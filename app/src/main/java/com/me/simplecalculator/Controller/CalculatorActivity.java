package com.me.simplecalculator.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.me.simplecalculator.R;
import com.me.simplecalculator.model.Calculator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends AppCompatActivity {


    @BindView(R.id.result_tv)
    TextView mResultTv;

    @BindView(R.id.exp_info_tv)
    TextView mExpInfoTv;

    private Calculator model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        ButterKnife.bind(this);

        model = new Calculator();
    }

    public void onCellClicked(View v) {
        Button button = (Button) v;
        String tag = button.getTag().toString();
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

        mExpInfoTv.setText(model.getMathExperssionInfo());
        mResultTv.setText(model.getResult());
    }


}
