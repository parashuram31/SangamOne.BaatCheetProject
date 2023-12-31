package com.SangamOne.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Content {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int content_id;
	@Column
	private String content_kn;
	@Column
	private String content_en;
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public String getContent_kn() {
		return content_kn;
	}
	public void setContent_kn(String content_kn) {
		this.content_kn = content_kn;
	}
	public String getContent_en() {
		return content_en;
	}
	public void setContent_en(String content_en) {
		this.content_en = content_en;
	}
	
	
}
