package com.springboot.restful.vo;

public class Camera_Image_VO {
	private String ci_imgpath;
	private String ci_imgname;
	private int ci_imgsize;
	private String ci_createtime;
	private int ras_idx;
	private int cell_idx;
	private String user_id;
	
	public String getCi_imgpath() {
		return ci_imgpath;
	}
	public void setCi_imgpath(String ci_imgpath) {
		this.ci_imgpath = ci_imgpath;
	}
	public String getCi_imgname() {
		return ci_imgname;
	}
	public void setCi_imgname(String ci_imgname) {
		this.ci_imgname = ci_imgname;
	}
	public int getCi_imgsize() {
		return ci_imgsize;
	}
	public void setCi_imgsize(int ci_imgsize) {
		this.ci_imgsize = ci_imgsize;
	}
	public String getCi_createtime() {
		return ci_createtime;
	}
	public void setCi_createtime(String ci_createtime) {
		this.ci_createtime = ci_createtime;
	}
	public int getRas_idx() {
		return ras_idx;
	}
	public void setRas_idx(int ras_idx) {
		this.ras_idx = ras_idx;
	}
	public int getCell_idx() {
		return cell_idx;
	}
	public void setCell_idx(int cell_idx) {
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
		return "Camera_Image_VO [ci_imgpath=" + ci_imgpath + ", ci_imgname=" + ci_imgname + ", ci_imgsize=" + ci_imgsize + ", ci_createtime=" + ci_createtime
				+ ", ras_idx=" + ras_idx + ", cell_idx=" + cell_idx + ", user_id=" + user_id + "]";
	}	
}
