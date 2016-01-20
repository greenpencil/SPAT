package Model;

import java.time.OffsetDateTime;

public class TheSession {
	private int sessionID;
	private String name;
	private OffsetDateTime start, stop;	
	
	public TheSession() {
		
	}

	public int getSessionID() {
		return sessionID;
	}

	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OffsetDateTime getStart() {
		return start;
	}

	public void setStart(OffsetDateTime start) {
		this.start = start;
	}

	public OffsetDateTime getStop() {
		return stop;
	}

	public void setStop(OffsetDateTime stop) {
		this.stop = stop;
	}	
	

}