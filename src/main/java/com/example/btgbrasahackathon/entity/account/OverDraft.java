package com.example.btgbrasahackathon.entity.account;

import com.example.btgbrasahackathon.entity.Links;
import com.example.btgbrasahackathon.entity.Meta;

public class OverDraft {
	private OverDraftDTO data;
    private Links links;
    private Meta meta;
    
	public OverDraftDTO getData() {
		return data;
	}
	public void setData(OverDraftDTO data) {
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
