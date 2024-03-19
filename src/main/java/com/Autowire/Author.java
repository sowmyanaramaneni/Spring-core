package com.Autowire;

public class Author {
	private int authorid;
	private String authorname;
	
	public Author(int authorid, String authorname) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + "]";
	}
	

}
