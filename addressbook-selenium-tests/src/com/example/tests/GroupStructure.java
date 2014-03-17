package com.example.tests;

public class GroupStructure {
	public String name;
	public String header;
	public String footer;

	public GroupStructure() {
	}
	public GroupStructure(String groupname, String header, String footer) {
		this.name = groupname;
		this.header = header;
		this.footer = footer;
	}
}