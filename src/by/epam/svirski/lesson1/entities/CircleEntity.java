package by.epam.svirski.lesson1.entities;

import java.util.StringJoiner;

public class CircleEntity {
	
	private double radius;

	public CircleEntity() {
	
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CircleEntity other = (CircleEntity) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ");
		joiner.add(this.getClass().getSimpleName());
		joiner.add("radius: " + Double.toString(radius));
		return joiner.toString();
	}
	
	
	
	
}
