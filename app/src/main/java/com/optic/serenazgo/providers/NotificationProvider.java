package com.optic.serenazgo.providers;

import com.optic.serenazgo.models.FCMBody;
import com.optic.serenazgo.models.FCMResponse;
import com.optic.serenazgo.retrofit.IFCMApi;
import com.optic.serenazgo.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
