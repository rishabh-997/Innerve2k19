package com.rishabh.medidocapp.HomeScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.rishabh.medidocapp.Aptos.MVP.AptosActivity;
import com.rishabh.medidocapp.Brainy.MVP.BrainyActivity;
import com.rishabh.medidocapp.ChestCancer.MVP.ChestActivity;
import com.rishabh.medidocapp.R;
import com.rishabh.medidocapp.SkinCancer.MVP.SkinActivity;

public class HomePageActivity extends AppCompatActivity {

    Button brainy, aptos, chest, skin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        brainy = findViewById(R.id.Brainy);
        aptos = findViewById(R.id.Aptos);
        chest = findViewById(R.id.chest);
        skin = findViewById(R.id.skin);

        brainy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, BrainyActivity.class));
            }
        });

        aptos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, AptosActivity.class));
            }
        });

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, ChestActivity.class));
            }
        });

        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, SkinActivity.class));
            }
        });
    }
}
