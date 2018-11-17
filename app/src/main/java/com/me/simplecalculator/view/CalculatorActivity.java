package com.me.simplecalculator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.me.simplecalculator.R;
import com.me.simplecalculator.presenter.CalculatorPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends AppCompatActivity implements CalculatorViewContract {


    @BindView(R.id.result_tv)
    TextView mResultTv;

    @BindView(R.id.exp_info_tv)
    TextView mExpInfoTv;

    CalculatorPresenter calculatorPresenter = new CalculatorPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        ButterKnife.bind(this);

        calculatorPresenter.onCreate();
    }

    public void onCellClicked(View v) {
        Button button = (Button) v;
        String tag = button.getTag().toString();
        calculatorPresenter.onButtonClicked(tag);
    }


    @Override
    public void showExperssion(String exp) {
        mExpInfoTv.setText(exp);
    }

    @Override
    public void showResult(String result) {
        mResultTv.setText(result);
    }

}
