import java.rmi.Remote;
import java.rmi.RemoteException;

interface LinkedListExcep extends Remote {
	public void insert(String s1, String s2, int m, int y)
			throws RemoteException;

	public Player readPlayer(int el) throws RemoteException;

	public int count() throws RemoteException;

	public int count2() throws RemoteException;

	public void delete_all() throws RemoteException;

	public void printlist() throws RemoteException;
}