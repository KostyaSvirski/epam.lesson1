package by.epam.svirski.lesson1.utils;

public enum Monthes {
	
	FEBRUARY_LEAP(29),
	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUNE(30),
	JULY(31),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);
	
	private int days;

	private Monthes(int days) {
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
	
	
	
	
	
}
