package com.springboot.restful.dao;

import java.util.Map;

import com.springboot.restful.vo.Arduino_VO;
import com.springboot.restful.vo.Camera_Image_VO;
import com.springboot.restful.vo.Raspberry_Setting_VO;
import com.springboot.restful.vo.Sensor_Value_VO;
import com.springboot.restful.vo.Watering_Control_VO;


public interface restfulMapper {
	
	int insert_rest(Sensor_Value_VO sensor_value_vo);
	
	Arduino_VO insert_search(Map<String, Object> map) throws Exception;
	
	Raspberry_Setting_VO setting_search(Map<String, Object> map) throws Exception;
	
	Watering_Control_VO search_ras_water(Map<String,Object> map) throws Exception;
	
	Camera_Image_VO search_ras_image(Map<String,Object> map) throws Exception;
	
	int	insert_watering_control(Watering_Control_VO watering_vo);
	
	int insert_camera_image(Camera_Image_VO image_vo);
}