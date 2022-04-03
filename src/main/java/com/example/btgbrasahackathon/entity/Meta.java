package com.example.btgbrasahackathon.entity;

import java.util.Date;

public class Meta {
    private int totalRecords;
    private int totalPages;
    private Date requestDateTime;
    
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Date getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
}
