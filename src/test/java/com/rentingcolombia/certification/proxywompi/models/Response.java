package com.rentingcolombia.certification.proxywompi.models;

import java.util.ArrayList;
import java.util.List;

public class Response{

	private String status;
	private List<Data> data;
	private static Response response;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public static Response getResponse() {
		return response;
	}

	public static void setResponse(Response response) {
		Response.response = response;
	}
}
