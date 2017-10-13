public class DateOfBirth {

	private int month, year;

	public DateOfBirth(int m, int y) {
		month = m;
		year = y;
	}

	public String toString() {
		return month + ",  " + year;
	}

	public void reset(int m, int y) {
		month = m;
		year = y;
	}

}
