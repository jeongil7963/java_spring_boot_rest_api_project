package com.springboot.restful.vo;

public class Arduino_VO {
	public String ard_sensor1_title;
	public String user_id;
	public String ard_idx;
	public String cell_idx;
	
	
	
	@Override
	public String toString() {
		return "Arduino_VO [ard_sensor1_title=" + ard_sensor1_title + ", user_id=" + user_id + ", ard_idx=" + ard_idx + ", cell_idx=" + cell_idx + "]";
	}

	public String getArd_sensor1_title() {
		return ard_sensor1_title;
	}

	public void setArd_sensor1_title(String ard_sensor1_title) {
		this.ard_sensor1_title = ard_sensor1_title;
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

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
}
