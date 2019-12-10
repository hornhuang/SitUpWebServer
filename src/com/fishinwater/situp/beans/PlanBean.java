package com.fishinwater.situp.beans;

import java.util.UUID;

public class PlanBean {
	
	private String plan_id;
	private String plan_title;
	private String plan_content;
	private String plan_start_date;
	private String plan_end_date;
	private String plan_score;
	
	public PlanBean() {
		super();
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public String getPlan_title() {
		return plan_title;
	}
	public void setPlan_title(String plan_title) {
		this.plan_title = plan_title;
	}
	public String getPlan_content() {
		return plan_content;
	}
	public void setPlan_content(String plan_content) {
		this.plan_content = plan_content;
	}
	public String getPlan_start_date() {
		return plan_start_date;
	}
	public void setPlan_start_date(String plan_start_date) {
		this.plan_start_date = plan_start_date;
	}
	public String getPlan_end_date() {
		return plan_end_date;
	}
	public void setPlan_end_date(String plan_end_date) {
		this.plan_end_date = plan_end_date;
	}
	public String getPlan_score() {
		return plan_score;
	}
	public void setPlan_score(String plan_score) {
		this.plan_score = plan_score;
	}
	@Override
	public String toString() {
		return "PlanBean [plan_id=" + plan_id + ", plan_title=" + plan_title + ", plan_content=" + plan_content
				+ ", plan_start_date=" + plan_start_date + ", plan_end_date=" + plan_end_date + ", plan_score="
				+ plan_score + "]";
	}
	
	
}
