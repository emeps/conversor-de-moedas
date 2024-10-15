package org.example;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

public class MoneyConvertResult {
    @SerializedName("conversion_rate")
    public double conversion_rate;
    @SerializedName("conversion_result")
    public double conversion_result;

    public void fomartterMoneyConvertResult(String moneyFrom, String moneyTo, double value) {
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Valor a ser convertido: "+ value +" "+ moneyFrom);
        System.out.println("Valor convertido: " + df.format(conversion_result) +" "+ moneyTo);
        System.out.println("Taxa de conversão é: " + conversion_rate + " " + moneyTo +" para 1 " + moneyFrom);
    }
}
