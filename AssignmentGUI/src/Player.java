class Player {
	private String name;
	private String position;
	private DateOfBirth dob;
	public Player next;

	public Player(String n, String p, int m, int y) {
		name = n;
		position = p;
		dob = new DateOfBirth(m, y);
	}

	public String readName() {
		return name;
	}

	public String readPosition() {
		return position;
	}

	public String readDateOfBirth() {
		return dob.toString();
	}

	public void resetPlayer(int m, int y) {
		dob.reset(m, y);
	}

	public void print() {
		System.out.println("Player: " + name + ",	Position: " + position
				+ ",	Date Of Birth: " + dob);
	}
}