package com.rishabh.medidocapp.Utilities;

import com.google.gson.JsonObject;
import com.rishabh.medidocapp.Aptos.Model.AptosResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Rishabh Agarwal on 23/09/2019
 */

public interface ClientAPI
{
    @POST("aptos/")
    Call<AptosResponse> sendurl(
            @Body JsonObject object
    );
}
