package com.rishabh.medidocapp.SkinCancer.MVP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rishabh.medidocapp.R;

public class SkinActivity extends AppCompatActivity implements SkinContract.view
{
    SkinContract.presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);

        presenter = new SkinPresenter(this);
    }
}
