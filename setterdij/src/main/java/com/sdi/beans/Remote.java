package com.sdi.beans;

public class Remote {
	private Television television;
	
	public void setTelevision(Television television) {
		this.television = television;
	}
	
	public void powerOn() {
		television.on();
	}

}
