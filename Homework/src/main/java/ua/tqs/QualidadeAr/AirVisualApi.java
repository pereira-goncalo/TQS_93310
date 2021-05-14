package ua.tqs.QualidadeAr;

import okhttp3.*;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class AirVisualApi {

    private final String KEY = "49ed1b1b-8e0f-440e-b9fe-7f1c2bdc4547";

    public String requestForCity(String city, String state, String name) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(String.format("https://api.airvisual.com/v2/city?city=%s&state=%s&country=%s&key=%s", city, state, name, KEY))
                .method("GET", null)
                .build();
        return client.newCall(request).execute().body().string();
    }

    public String requestForCoords(String lat, String lon) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(String.format("https://api.airvisual.com/v2/nearest_city?lat=%s&lon=%s&key=%s", lat, lon, KEY))
                .method("GET", null)
                .build();
        return client.newCall(request).execute().body().string();
    }
}