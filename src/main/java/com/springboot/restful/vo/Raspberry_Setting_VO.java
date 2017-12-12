package com.springboot.restful.vo;

public class Raspberry_Setting_VO {
	private String ras_name;
	private int ras_watering_operatingtime;
	private String ras_createtime;
	private int ras_camera_operatingtime;
	private String cell_idx;
	private String user_id;
	
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRas_name() {
		return ras_name;
	}
	public void setRas_name(String ras_name) {
		this.ras_name = ras_name;
	}
	public int getRas_watering_operatingtime() {
		return ras_watering_operatingtime;
	}
	public void setRas_watering_operatingtime(int ras_watering_operatingtime) {
		this.ras_watering_operatingtime = ras_watering_operatingtime;
	}
	public String getRas_createtime() {
		return ras_createtime;
	}
	public void setRas_createtime(String ras_createtime) {
		this.ras_createtime = ras_createtime;
	}
	public int getRas_camera_operatingtime() {
		return ras_camera_operatingtime;
	}
	public void setRas_camera_operatingtime(int ras_camera_operatingtime) {
		this.ras_camera_operatingtime = ras_camera_operatingtime;
	}
	public String getCell_idx() {
		return cell_idx;
	}
	public void setCell_idx(String cell_idx) {
		this.cell_idx = cell_idx;
	}
	@Override
	public String toString() {
		return "Raspberry_Setting_VO [ras_name=" + ras_name + ", ras_watering_operatingtime=" + ras_watering_operatingtime + ", ras_createtime="
				+ ras_createtime + ", ras_camera_operatingtime=" + ras_camera_operatingtime + ", cell_idx=" + cell_idx + ", user_id=" + user_id + "]";
	}

}
