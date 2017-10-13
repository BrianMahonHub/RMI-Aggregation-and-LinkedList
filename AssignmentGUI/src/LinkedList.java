class LinkedList {
	private Player head;

	public LinkedList() {
		head = null;
	}
	

	public void insert(String s1, String s2, int m, int y) {
		Player temp = new Player(s1, s2, m, y);
		temp.next = head;
		head = temp;
	}
	

	public Player readPlayer(int el) {
		if (head == null || this.count() < el)
			return null;
		Player temp = head;
		int current = 1;
		while (current != el) {
			current++;
			temp = temp.next;
		}
		return temp;
	}

	
	public int count() {
		Player temp = head;
		int res = 0;
		while (temp != null) {
			res++;
			temp = temp.next;
		}
		return res;
	}

	
	public int count2() {
		Player temp = head;
		int res = 0;
		while (temp != null) {
			res++;
			temp = temp.next;
		}
		return res;
	}
	
	
	public void delete_all() {
		head = null;
	}
	

	public void printlist() {
		Player temp = head;
		System.out.println("\nSquad Profiles:");
		while (temp != null) {
			temp.print();
			temp = temp.next;
		}

		System.out.print("Add Additional Players");
	}
}