package com.me.simplecalculator.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.me.simplecalculator.R;
import com.me.simplecalculator.databinding.CalculatorLayoutBinding;
import com.me.simplecalculator.viewmodel.CalculatorViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends AppCompatActivity {


    CalculatorViewModel viewModel = new CalculatorViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        CalculatorLayoutBinding binding =
                DataBindingUtil.setContentView(this, R.layout.calculator_layout);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
    }


}
