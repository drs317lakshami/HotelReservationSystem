package com.brigdgelabz.hotelreservation;

public class Hotel {
	private final String nameOfHotel;
	private final int rate;

	public Hotel(String nameOfHotel, int rate) {
		this.nameOfHotel = nameOfHotel;
		this.rate = rate;
	}

	public String getnameOfHotel() {
		return nameOfHotel;
	}

	public int getRate() {
		return rate;
	}
}