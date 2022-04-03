package com.example.btgbrasahackathon.entity.account;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class Balances{
	private BalancesDTO data;
    private Meta meta;
    private Links links;
    
	public BalancesDTO getData() {
		return data;
	}
	public void setData(BalancesDTO data) {
		this.data = data;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
}
