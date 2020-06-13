package by.epam.svirski.lesson1.entities;

import java.util.StringJoiner;

public class TimeEntity {
	
	private int seconds;

	public TimeEntity() {
		super();
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + seconds;
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
		TimeEntity other = (TimeEntity) obj;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ");
		joiner.add(this.getClass().getSimpleName());
		joiner.add("seconds " + seconds);
		return joiner.toString();
	}
	
	
}	
