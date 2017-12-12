package com.springboot.restful.vo;

public class Watering_Control_VO {
	private String wc_operatingtime;
	private String wc_createtime;
	private String ras_idx;
	private String cell_idx;
	private String user_id;
	private String wc_type;
	
	
	
	public String getWc_type() {
		return wc_type;
	}
	public void setWc_type(String wc_type) {
		this.wc_type = wc_type;
	}
	public String getWc_operatingtime() {
		return wc_operatingtime;
	}
	public void setWc_operatingtime(String wc_operatingtime) {
		this.wc_operatingtime = wc_operatingtime;
	}
	public String getWc_createtime() {
		return wc_createtime;
	}
	public void setWc_createtime(String wc_createtime) {
		this.wc_createtime = wc_createtime;
	}
	public String getRas_idx() {
		return ras_idx;
	}
	public void setRas_idx(String ras_idx) {
		this.ras_idx = ras_idx;
	}
	public String getCell_idx() {
		return cell_idx;
	}
	public void setCell_idx(String cell_idx) {
		this.cell_idx = cell_idx;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Watering_Control_VO [wc_operatingtime=" + wc_operatingtime + ", wc_createtime=" + wc_createtime + ", ras_idx=" + ras_idx + ", cell_idx="
				+ cell_idx + ", user_id=" + user_id + ", wc_type=" + wc_type + "]";
	}
}
