package com.example.btgbrasahackathon.entity.creditcard;

import java.util.ArrayList;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class CreditLimits {
	private ArrayList<CreditBillsLimitsDTO> data;
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
	public ArrayList<CreditBillsLimitsDTO> getData() {
		return data;
	}
	public void setData(ArrayList<CreditBillsLimitsDTO> data) {
		this.data = data;
	}
}
