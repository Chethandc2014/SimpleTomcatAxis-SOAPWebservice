package com.calservice;

import javax.xml.ws.Endpoint;

public class CalServicePublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:1236/CalculatorServiceImpl", new CalculatorServiceImpl());
	}

}
