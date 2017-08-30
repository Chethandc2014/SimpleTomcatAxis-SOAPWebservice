package com.calservice;

import javax.jws.WebService;



@WebService(endpointInterface="com.calservice.CalculatorService",serviceName="MyCalculartorService",name="MyName")
public class CalculatorServiceImpl implements CalculatorService {
	
	public int getSquare(int number) {
		// TODO Auto-generated method stub
		return number*number;
	}
}
