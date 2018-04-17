package io.proj.Smite;

import java.io.IOException;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.http.HttpMethod;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.RequestBuilder;

public class ClientHttp {
	
	private static OkHttpClient okHttpClient;

    private ClientHttp() {
        okHttpClient = getInstance();
    }

    public static synchronized OkHttpClient getInstance() {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }

        return okHttpClient;
    }

    public static String fetch(String url) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = getInstance().newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            return null;
        }
}
	

}
