package com.example.btgbrasahackathon.entity.account;

import java.util.ArrayList;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class Account{
	private ArrayList<AccountDTO> data;
    private Links links;
    private Meta meta;
    
    public Account(){}
    
	public ArrayList<AccountDTO> getData() {
		return data;
	}

	public void setData(ArrayList<AccountDTO> data) {
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
