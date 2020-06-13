package by.epam.svirski.lesson1.entities;

import java.util.StringJoiner;

public class PointEntity {

	private double coordinateX;
	private double coordinateY;

	public PointEntity() {

	}

	public double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(double coordinateY) {
		this.coordinateY = coordinateY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coordinateX);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(coordinateY);
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
		PointEntity other = (PointEntity) obj;
		if (Double.doubleToLongBits(coordinateX) != Double.doubleToLongBits(other.coordinateX))
			return false;
		if (Double.doubleToLongBits(coordinateY) != Double.doubleToLongBits(other.coordinateY))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ");
		joiner.add(this.getClass().getSimpleName());
		joiner.add("first coordinate " + Double.toString(coordinateX));
		joiner.add("second coordinate " + Double.toString(coordinateY));
		return joiner.toString();
	}

}
