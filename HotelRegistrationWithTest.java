package com.brigdgelabz.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelRegistrationWithTest {

	HotelMain hotelReservation = new HotelMain();

	@Test
	public void givenHotelShouldBeFromHotelList() {
		boolean result = hotelReservation.addingHotelname(new Hotel("LackWood", 110));
		Assertions.assertTrue(result);
	}
	}