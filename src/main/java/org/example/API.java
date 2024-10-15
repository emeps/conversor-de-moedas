package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    private String apiKey = "719d61921ab0c585edd4f16b";

    public String formatterAddress(String moneyFrom, String moneyTo, double amount) {
        String address = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+moneyFrom+"/"+moneyTo+"/"+ amount;
        return address;
    }

    public MoneyConvertResult callToApi(String address) throws IOException, InterruptedException {
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return gson.fromJson(json, MoneyConvertResult.class);
    }
}
