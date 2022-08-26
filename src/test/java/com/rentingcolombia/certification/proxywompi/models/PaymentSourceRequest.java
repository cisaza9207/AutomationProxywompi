package com.rentingcolombia.certification.proxywompi.models;

public class PaymentSourceRequest{
	private String costumerEmail;
	private String paymentSourceToken;
	private String transactionReference;
	private String bussinessName;
	private String paymentSourceType;
	private static PaymentSourceRequest paymentSourceRequest;

	public void setCostumerEmail(String costumerEmail){
		this.costumerEmail = costumerEmail;
	}

	public String getCostumerEmail(){
		return costumerEmail;
	}

	public void setPaymentSourceToken(String paymentSourceToken){
		this.paymentSourceToken = paymentSourceToken;
	}

	public String getPaymentSourceToken(){
		return paymentSourceToken;
	}

	public void setTransactionReference(String transactionReference){
		this.transactionReference = transactionReference;
	}

	public String getTransactionReference(){
		return transactionReference;
	}

	public void setBussinessName(String bussinessName){
		this.bussinessName = bussinessName;
	}

	public String getBussinessName(){
		return bussinessName;
	}

	public void setPaymentSourceType(String paymentSourceType){
		this.paymentSourceType = paymentSourceType;
	}

	public String getPaymentSourceType(){
		return paymentSourceType;
	}

	public static PaymentSourceRequest getPaymentSourceRequest() {
		return paymentSourceRequest;
	}

	public static void setPaymentSourceRequest(PaymentSourceRequest paymentSourceRequest) {
		PaymentSourceRequest.paymentSourceRequest = paymentSourceRequest;
	}
}
