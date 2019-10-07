package com.rishabh.medidocapp.Brainy.MVP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rishabh.medidocapp.R;

public class BrainyActivity extends AppCompatActivity implements BrainyContract.view
{
    BrainyContract.presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brainy);

        presenter = new BrainyPresenter(this);
    }
}
