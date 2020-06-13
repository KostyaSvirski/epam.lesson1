package by.epam.svirski.lesson1.entities;

import java.util.StringJoiner;

public class SquareEntity {
	
	private double area;

	public SquareEntity() {
		super();
	}

	public double getArea() {
		return area;
	}

	public void setArea(double areaInput) {
		this.area = areaInput;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
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
		SquareEntity other = (SquareEntity) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ");
		joiner.add(this.getClass().getSimpleName());
		joiner.add("area: " + Double.toString(area));		
		return joiner.toString();
	}
	
	
	
	
	
	
}
