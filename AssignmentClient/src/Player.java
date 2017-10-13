import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class Player {
	private String name;
	private String position;
	private DateOfBirth dob;
	public Player next;

	public Player(String n, String p, int m, int y) throws RemoteException {
		name = n;
		position = p;
		dob = new DateOfBirth(m, y);
	}

	public String readName() throws RemoteException {
		return name;
	}

	public String readPosition() throws RemoteException {
		return position;
	}

	public String readDateOfBirth() throws RemoteException {
		return dob.toString();
	}

	public void resetPlayer(int m, int y) throws RemoteException {
		dob.reset(m, y);
	}

	public void print() throws RemoteException {
		System.out.println("Player: " + name + ", Position: " + position
				+ ", Date Of Birth: " + dob);
	}
}