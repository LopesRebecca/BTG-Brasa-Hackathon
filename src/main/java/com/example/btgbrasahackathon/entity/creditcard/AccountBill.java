package com.example.btgbrasahackathon.entity.creditcard;

import java.util.ArrayList;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class AccountBill {
	private ArrayList<CreditBillsDTO> data;
    private Links links;
    private Meta meta;
    
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
	public ArrayList<CreditBillsDTO> getData() {
		return data;
	}
	public void setData(ArrayList<CreditBillsDTO> data) {
		this.data = data;
	}
}
