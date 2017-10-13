import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.*;
import java.rmi.server.*;

class LinkedList implements LinkedListExcep, Serializable {
	private Player head;

	public LinkedList() {
		head = null;
	}

	public void insert(String s1, String s2, int m, int y)
			throws RemoteException {
		Player temp = new Player(s1, s2, m, y);
		temp.next = head;
		head = temp;
	}

	public Player readPlayer(int el)throws RemoteException {
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

	public int count()throws RemoteException {
		Player temp = head;
		int res = 0;
		while (temp != null) {
			res++;
			temp = temp.next;
		}

		return res;
	}

	public int count2()throws RemoteException {
		Player temp = head;
		int res = 0;
		while (temp != null) {
			res++;
			temp = temp.next;
		}

		return res;
	}

	public void delete_all()throws RemoteException {
		head = null;
	}

	public void printlist() throws RemoteException {
		Player temp = head;
		System.out.println("\nSquad Profiles:");
		while (temp != null) {
			temp.print();
			temp = temp.next;
		}

		System.out.print("Add Additional Players");
	}
}