package com.rishabh.medidocapp.ChestCancer.MVP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rishabh.medidocapp.R;

public class ChestActivity extends AppCompatActivity implements ChestContract.view
{
    ChestContract.presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        presenter = new ChestPresenter(this);
    }
}
