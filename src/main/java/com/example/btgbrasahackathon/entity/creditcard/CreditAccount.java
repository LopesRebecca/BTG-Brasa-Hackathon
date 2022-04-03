package com.example.btgbrasahackathon.entity.creditcard;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class CreditAccount {
	private CreditDTO data;
    private Links links;
    private Meta meta;
    
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
	public CreditDTO getData() {
		return data;
	}
	public void setData(CreditDTO data) {
		this.data = data;
	}
    
}
