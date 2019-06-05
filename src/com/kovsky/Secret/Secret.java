package com.kovsky.Secret;

public class Secret{

	private String id;
	private String name;
	private String passWord;
	

	public Secret() {
		setId("");
	}


	public String getId() {
		return id;
	}


	private void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
