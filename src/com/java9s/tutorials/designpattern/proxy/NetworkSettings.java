package com.java9s.tutorials.designpattern.proxy;

public class NetworkSettings {
	public ISP getInternet(){
		return new InternetProxy();
	}
	
	public ISP getISP(){
		return new Vodafone();
	}
}
