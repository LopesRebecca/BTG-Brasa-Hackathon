package com.example.btgbrasahackathon.entity.customers;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class CustomerQualifications {
	private CustomerQualificationsDTO data;
	private Links links;
	private Meta meta;
	
	public CustomerQualificationsDTO getData() {
		return data;
	}
	public void setData(CustomerQualificationsDTO data) {
		this.data = data;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	    
}
