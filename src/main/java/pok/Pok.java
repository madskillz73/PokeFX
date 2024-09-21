package pok;

import java.util.Map;
import java.util.Set;

public class Pok {
	
	//**** PKFX-01 Pok Class ****//
	
	private int id;
	
	private String name;
	
	//Health Points
	
	private int hP;
	
	private Map<String, Set<String>> types;
	
	// Physical Attack
	
	private int pAt;
	
	// Special Attack
	
	private int sAt;
	
	private String status;
	
	private boolean ko;
	
	
	// Basic constructor, no status nor id needed
	
	public Pok(String name, int hP,Map<String, Set<String>> types, int pAt, int sAt, String status) {
		super();
		this.name = name;
		this.hP = hP;
		this.types = types;
		this.pAt = pAt;
		this.sAt = sAt;
		this.status = status;
		this.ko = false;
	}
	
	//Empty constructor for testing
	
	public Pok() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Set<String>> getTypes() {
		return types;
	}

	public void setTypes(Map<String, Set<String>> types) {
		this.types = types;
	}

	public int getpAt() {
		return pAt;
	}

	public void setpAt(int pAt) {
		this.pAt = pAt;
	}

	public int getsAt() {
		return sAt;
	}

	public void setsAt(int sAt) {
		this.sAt = sAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isKo() {
		return ko;
	}

	public void setKo(boolean ko) {
		this.ko = ko;
	}
	
}
