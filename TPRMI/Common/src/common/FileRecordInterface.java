package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FileRecordInterface extends Remote {

	public String getFileRecord() throws RemoteException;
	
	public void setFileRecord(String newData) throws RemoteException;
}
