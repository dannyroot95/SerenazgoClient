package com.optic.serenazgo.retrofit;

import com.optic.serenazgo.models.FCMBody;
import com.optic.serenazgo.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAcDMGUCQ:APA91bFrHstW14OwbqsRXNHC9Jxli8MiCiJouiQKRfLDSctGnhqvMC5RaGc74UFkG41RrQKy_lwTMA1Jdz2Ft1-HJqAuErNbDpCRkwRQQMxIzNfznZlZT0lzXjU6dZwZDAqV95dc_GRO"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);

}
