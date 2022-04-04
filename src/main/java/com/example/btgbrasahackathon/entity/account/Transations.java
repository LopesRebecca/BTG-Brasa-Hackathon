package com.example.btgbrasahackathon.entity.account;

import java.util.ArrayList;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class Transations {
	private ArrayList<TransationsDTO> data;
    private Links links;
    private Meta meta;
    
	public ArrayList<TransationsDTO> getData() {
		return data;
	}
	public void setData(ArrayList<TransationsDTO> data) {
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
