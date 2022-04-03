package com.example.btgbrasahackathon.entity.creditcard;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class CreditCardAccountId {
	
	private CreditCardDTO data;
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
	public CreditCardDTO getData() {
		return data;
	}
	public void setData(CreditCardDTO data) {
		this.data = data;
	}
    
}