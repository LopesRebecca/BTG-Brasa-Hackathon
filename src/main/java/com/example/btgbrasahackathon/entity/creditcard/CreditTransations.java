package com.example.btgbrasahackathon.entity.creditcard;

import java.util.ArrayList;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class CreditTransations {
	private ArrayList<CreditTransationsDTO> data;
    private Links links;
    private Meta meta;
    
	public ArrayList<CreditTransationsDTO> getData() {
		return data;
	}
	public void setData(ArrayList<CreditTransationsDTO> data) {
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
