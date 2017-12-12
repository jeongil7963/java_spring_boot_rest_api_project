package com.springboot.restful.vo;

public class Sensor_Value_VO {
	
	private String sv_sensor1;
	private String sv_createtime;
	private String ard_idx;
	private String cell_idx;
	private String user_id;
	
	public Sensor_Value_VO() {
		super();
	}	
	
	@Override
	public String toString() {
		return "Sensor_Value_VO [sv_sensor1=" + sv_sensor1 + ", sv_createtime=" + sv_createtime + ", ard_idx=" + ard_idx + ", cell_idx=" + cell_idx
				+ ", user_id=" + user_id + "]";
	}

	public String getArd_idx() {
		return ard_idx;
	}

	public void setArd_idx(String ard_idx) {
		this.ard_idx = ard_idx;
	}

	public String getCell_idx() {
		return cell_idx;
	}

	public void setCell_idx(String cell_idx) {
		this.cell_idx = cell_idx;
	}

	public String getSv_sensor1() {
		return sv_sensor1;
	}
	public void setSv_sensor1(String sv_sensor1) {
		this.sv_sensor1 = sv_sensor1;
	}
	public String getSv_createtime() {
		return sv_createtime;
	}
	public void setSv_createtime(String sv_createtime) {
		this.sv_createtime = sv_createtime;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
}
