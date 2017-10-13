import java.rmi.*;
import java.rmi.server.*;

class PlayerLLServer {
	public static void main(String[] args) {
		try {
			LinkedListExcep list = new LinkedList();
			Naming.rebind("Players", list);
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
	}
}
