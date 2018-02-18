
public final class Date implements Comparable<Date> {
	private final int day;
	private final int month;
	private final int year;
	
	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}
	
	@Override
	public boolean equals(Object y) {
		if (y == this) return true;
		if (y == null) return false;		
		if (y.getClass() != this.getClass()) return false;
		
		// this will definitely succeed
		Date that = (Date)y;
		if (that.day != this.day) return false;
		if (that.month != this.month) return false;
		if (that.year != this.year) return false;
		
		return true;
	}

	@Override
	public int compareTo(Date o) {
		return 0;
	}
}
