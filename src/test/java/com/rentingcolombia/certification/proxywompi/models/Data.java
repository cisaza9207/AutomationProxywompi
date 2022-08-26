package com.rentingcolombia.certification.proxywompi.models;

public class Data {
	private String cardHolder;
	private String expiresAt;
	private String lastFour;
	private String bin;
	private String name;
	private String createdAt;
	private String expMonth;
	private String id;
	private String expYear;
	private String createdWithCvc;
	private String brand;
	private String validityEndsAt;


	public void setCardHolder(String cardHolder){
		this.cardHolder = cardHolder;
	}

	public String getCardHolder(){
		return cardHolder;
	}

	public void setExpiresAt(String expiresAt){
		this.expiresAt = expiresAt;
	}

	public String getExpiresAt(){
		return expiresAt;
	}

	public void setLastFour(String lastFour){
		this.lastFour = lastFour;
	}

	public String getLastFour(){
		return lastFour;
	}

	public void setBin(String bin){
		this.bin = bin;
	}

	public String getBin(){
		return bin;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setExpMonth(String expMonth){
		this.expMonth = expMonth;
	}

	public String getExpMonth(){
		return expMonth;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setExpYear(String expYear){
		this.expYear = expYear;
	}

	public String getExpYear(){
		return expYear;
	}

	public void setCreatedWithCvc(String createdWithCvc){
		this.createdWithCvc = createdWithCvc;
	}

	public String isCreatedWithCvc(){
		return createdWithCvc;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setValidityEndsAt(String validityEndsAt){
		this.validityEndsAt = validityEndsAt;
	}

	public String getValidityEndsAt(){
		return validityEndsAt;
	}
}
