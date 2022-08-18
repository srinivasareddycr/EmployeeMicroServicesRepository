package com.emp.model;

public class Record {


	private long cID;
	
	private String  email;
	
	private String companyName;
	
	private Long eId;

	public long getcID() {
		return cID;
	}

	public void setcID(long cID) {
		this.cID = cID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public Record(long cID, String email, String companyName, Long eId) {
		super();
		this.cID = cID;
		this.email = email;
		this.companyName = companyName;
		this.eId = eId;
	}

	public Record() {
		super();
	}
	
	
}
