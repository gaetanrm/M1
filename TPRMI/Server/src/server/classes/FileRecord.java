package server.classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.FileRecordInterface;

public class FileRecord extends UnicastRemoteObject implements FileRecordInterface {

	private String fileRecord;
	
	public FileRecord(String fileRecord) throws RemoteException {}
	
	public String getFileRecord() throws RemoteException {
		return fileRecord;
	}
	
	public void setFileRecord(String newData) throws RemoteException{
		fileRecord = newData;
	}
}
