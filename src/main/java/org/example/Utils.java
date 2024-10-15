package org.example;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Utils {
    Scanner scanner = new Scanner(System.in);

    public void menu(){

        System.out.println("Bem-vindo ao conversor de moedas");
        System.out.println("");
        System.out.println("1 - Conversão Dolar para Real");
        System.out.println("2 - Conversão Real para Dolar");
        System.out.println("3 - Conversão Peso Argentino para Real");
        System.out.println("4 - Conversão Real para Peso Argentino");
        System.out.println("5 - Conversão Euro para Real");
        System.out.println("6 - Conversão Real para Euro");
        System.out.println("7 - Conversão Iene Japonês para Real");
        System.out.println("8 - Conversão Real para Iene Japonês");
        System.out.println("9 - Sair");
        System.out.println("");
    }

    public void converterMoney(int option, double value) throws IOException, InterruptedException {
        String address;
        API api = new API();
        MoneyConvertResult result;
        switch (option){
            case 1:
                address = api.formatterAddress("USD", "BRL", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("USD", "BRL", value);
                break;
            case 2:
                address = api.formatterAddress("BRL", "USD", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("BRL", "USD", value);
                break;
            case 3:
                address = api.formatterAddress("ARS", "BRL", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("ARS", "BRL", value);
                break;
            case 4:
                address = api.formatterAddress("BRL", "ARS", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("BRL", "ARS", value);
                break;
            case 5:
                address = api.formatterAddress("EUR", "BRL", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("EUR", "BRL", value);
                break;
            case 6:
                address = api.formatterAddress("BRL", "EUR", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("BRL", "EUR", value);
                break;
            case 7:
                address = api.formatterAddress("JPY", "BRL", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("JPY", "BRL", value);
                break;
            case 8:
                address = api.formatterAddress("BRL", "JPY", value);
                result = api.callToApi(address);
                result.fomartterMoneyConvertResult("BRL", "JPY", value);
                break;
            case 9:
                System.out.println("Opção não implementada!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
    public void exitConverter(){
        System.out.println("Obrigado por utilizar o conversor de moeda!");
        exit(0);
    }
    public void clearInput(){
        scanner.nextLine();
    }
}
