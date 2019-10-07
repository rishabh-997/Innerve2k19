package com.rishabh.medidocapp.Aptos.MVP;

import android.os.Bundle;
import android.printservice.CustomPrinterIconCallback;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.rishabh.medidocapp.Aptos.Model.AptosResponse;
import com.rishabh.medidocapp.R;
import com.squareup.picasso.Picasso;

public class AptosActivity extends AppCompatActivity implements AptosContract.view
{
    AptosContract.presenter presenter;
    String aptos_url = "https://firebasestorage.googleapis.com/v0/b/innerve-hackathon.appspot.com/o/aptos%2FIMG_20181030_104432.jpg?alt=media&token=e7443c20-4c9c-4ba1-b466-7ebb2d2aa25e";
    String image_url = "http://10.42.0.1:5000/get-image/output_heat_map.png";

    Button sendurl, getimage;
    ImageView image;
    TextView result;
    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptos);

        presenter = new AptosPresenter(this);
        sendurl = findViewById(R.id.sendurl);
        getimage = findViewById(R.id.showImage);
        image = findViewById(R.id.image_container);
        result = findViewById(R.id.result);
        progressBar = findViewById(R.id.progressbar);

        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("url", aptos_url);

        sendurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                image.setVisibility(View.GONE);
                getimage.setVisibility(View.GONE);
                presenter.getResponse(jsonObject);
            }
        });

        getimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                Picasso.get().load(image_url).into(image);
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void showResult(AptosResponse body) {
        progressBar.setVisibility(View.GONE);
        result.setVisibility(View.VISIBLE);
        getimage.setVisibility(View.VISIBLE);
        image.setVisibility(View.VISIBLE);

        result.setText("Your Blindness is "+body.getNum()+" percent");

    }

    @Override
    public void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        progressBar.setVisibility(View.GONE);
    }
}

