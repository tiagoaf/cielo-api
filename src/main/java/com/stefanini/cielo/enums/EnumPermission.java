package com.stefanini.cielo.enums;

public enum EnumPermission {

	SAVE("save"), READ("read"), SEARCH("search"), DELETE("delete"), EXECUTE("execute"), REPORT("report");
	
	public String value;
	
	EnumPermission(String value) {
		this.value = value;
	}
}