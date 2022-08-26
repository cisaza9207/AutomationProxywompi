package com.rentingcolombia.certification.proxywompi.models;

public class LoginResponse {
    private static LoginResponse loginResponse;
    private String token;
    private String refresh;

    public LoginResponse(String token, String refresh) {
        this.token = token;
        this.refresh = refresh;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public static void setLoginResponse(LoginResponse loginResponseAux){
        loginResponse=loginResponseAux;
    }

    public static LoginResponse getLoginResponse(){
        return loginResponse;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", Refresh='" + refresh + '\'' +
                '}';
    }
}
