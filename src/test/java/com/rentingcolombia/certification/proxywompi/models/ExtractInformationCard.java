package com.rentingcolombia.certification.proxywompi.models;


import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;





public class ExtractInformationCard {
public String jsonResponse;
public static String status,id, cardHolder;


  public  ExtractInformationCard (String jsonResponse){
    this.jsonResponse =jsonResponse;
  }

  public void idCard() {
    JSONArray jsonArray = new JSONArray(jsonResponse);
    JSONObject jsonObject = jsonArray.getJSONObject(0);
    JSONObject data = jsonArray.getJSONObject(1);
    System.out.println("El token de pruebas es: "+ data.getString("id"));
  }






}
