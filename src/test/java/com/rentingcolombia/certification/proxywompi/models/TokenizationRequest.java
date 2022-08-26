package com.rentingcolombia.certification.proxywompi.models;


public class TokenizationRequest {

    private String number,cvc,exp_month,exp_year,card_holder;
    private static TokenizationRequest tokenizationRequest;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getExp_month() {
        return exp_month;
    }

    public void setExp_month(String exp_month) {
        this.exp_month = exp_month;
    }

    public String getExp_year() {
        return exp_year;
    }

    public void setExp_year(String exp_year) {
        this.exp_year = exp_year;
    }

    public String getCard_holder() {
        return card_holder;
    }

    public void setCard_holder(String card_holder) {
        this.card_holder = card_holder;
    }

    public static TokenizationRequest getTokenizationRequest() {
        return tokenizationRequest;
    }

    public static void setTokenizationRequest(TokenizationRequest tokenizationRequest) {
        TokenizationRequest.tokenizationRequest = tokenizationRequest;
    }
}
