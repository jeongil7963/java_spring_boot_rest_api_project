package com.springboot.restful.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restful.dao.restfulMapper;
import com.springboot.restful.vo.Arduino_VO;
import com.springboot.restful.vo.Camera_Image_VO;
import com.springboot.restful.vo.Raspberry_Setting_VO;
import com.springboot.restful.vo.Sensor_Value_VO;
import com.springboot.restful.vo.Watering_Control_VO;

@SpringBootApplication
@RestController
public class Restful_Controller {

	@Autowired
	private restfulMapper mapper;

	String resultmsg = "";
	
	@RequestMapping(value = "/device/camera")
	public @ResponseBody Map<String, Object> insert_camera_images(HttpServletRequest request) throws Exception {
		//반환 제이슨 데이터
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		//입력받은 제이슨 데이터
		String ci_imgname = request.getParameter("ci_imgname");
		String ci_imgsize_str = request.getParameter("ci_imgsize");
		int ci_imgsize = Integer.parseInt(ci_imgsize_str);
		String api_key = request.getParameter("api_key");
		String user_token = request.getParameter("user_token");

		//데이터 유효성 검사
		Camera_Image_VO image_vo;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("api_key", api_key);
		map.put("user_token", user_token);
		image_vo = mapper.search_ras_image(map);

		if (image_vo != null) {
			System.out.println(image_vo.toString());

			//유효성 검사 후 데이터 삽입
			Date from = new Date();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat transFormat2 = new SimpleDateFormat("yyyy-MM");
			SimpleDateFormat transFormat3 = new SimpleDateFormat("dd");
			
			String current_time = transFormat.format(from);
			String current_year_month = transFormat2.format(from);
			String current_day = transFormat3.format(from);
			String ci_imgpath = "C:/Users/owner820/Pictures/images/";
			ci_imgpath += image_vo.getUser_id() + "/";
			ci_imgpath += image_vo.getRas_idx() + "/";
			ci_imgpath += current_year_month + "/";
			ci_imgpath += current_day + "/";
			
			image_vo.setCi_imgpath(ci_imgpath);
			image_vo.setCi_imgname(ci_imgname);
			image_vo.setCi_imgsize(ci_imgsize);
			
			image_vo.setCi_createtime(current_time);
			//센서 데이터 삽입4
			mapper.insert_camera_image(image_vo);

			resultmsg = "watering sucess";
			jsonObject.put("resultmsg", resultmsg);
			jsonObject.put("ci_imgpath", ci_imgpath);
			

		} else {
			System.out.println("watering_vo : NULL");
			resultmsg = "watering fail";
			jsonObject.put("resultmsg", resultmsg);
		}

		return jsonObject;
	}

	@RequestMapping(value = "/device/watering")
	public @ResponseBody Map<String, Object> search_watering_control(HttpServletRequest request) throws Exception {
		//반환 제이슨 데이터
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		//입력받은 제이슨 데이터
		String wc_operatingtime = request.getParameter("wc_operatingtime");
		String wc_type = request.getParameter("wc_type");
		String api_key = request.getParameter("api_key");
		String user_token = request.getParameter("user_token");

		//데이터 유효성 검사
		Watering_Control_VO watering_vo;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("api_key", api_key);
		map.put("user_token", user_token);
		watering_vo = mapper.search_ras_water(map);

		if (watering_vo != null) {
			System.out.println(watering_vo.toString());

			//유효성 검사 후 데이터 삽입
			Date from = new Date();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String current_time = transFormat.format(from);
			watering_vo.setWc_createtime(current_time);
			watering_vo.setWc_operatingtime(wc_operatingtime);
			watering_vo.setWc_type(wc_type);
			//센서 데이터 삽입
			mapper.insert_watering_control(watering_vo);

			resultmsg = "watering sucess";
			jsonObject.put("resultmsg", resultmsg);			

		} else {
			System.out.println("watering_vo : NULL");
			resultmsg = "watering fail";
			jsonObject.put("resultmsg", resultmsg);
		}

		return jsonObject;
	}
	
	//센서 데이터 삽입 컨트롤러
	@RequestMapping(value = "/device/moisture")
	public @ResponseBody Map<String, Object> insert_rest(HttpServletRequest request) throws Exception {
		//반환 제이슨 데이터
		Map<String, Object> jsonObject = new HashMap<String, Object>();

		//입력받은 제이슨 데이터
		String sv_sensor1 = request.getParameter("sv_sensor1");
		String api_key = request.getParameter("api_key");
		String user_token = request.getParameter("user_token");

		//데이터 유효성 검사
		Arduino_VO arduino_vo;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("api_key", api_key);
		map.put("user_token", user_token);
		arduino_vo = mapper.insert_search(map);

		if (arduino_vo != null) {
			System.out.println(arduino_vo.toString());

			//유효성 검사 후 데이터 삽입
			Date from = new Date();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String current_time = transFormat.format(from);
			Sensor_Value_VO sensor_value_vo = new Sensor_Value_VO();
			sensor_value_vo.setSv_sensor1(sv_sensor1);
			sensor_value_vo.setSv_createtime(current_time);
			sensor_value_vo.setCell_idx(arduino_vo.getCell_idx());
			sensor_value_vo.setArd_idx(arduino_vo.getArd_idx());
			sensor_value_vo.setUser_id(arduino_vo.getUser_id());

			//센서 데이터 삽입
			mapper.insert_rest(sensor_value_vo);

			resultmsg = "sucess";
			jsonObject.put("resultmsg", resultmsg);

		} else {
			System.out.println("arduino_vo : NULL");
			resultmsg = "fail";
			jsonObject.put("resultmsg", resultmsg);
		}

		return jsonObject;
	}

	//센서 데이터 삽입 컨트롤러
	@RequestMapping(value = "/device" , method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> setting_search(HttpServletRequest request) throws Exception {
		//반환 제이슨 데이터
		Map<String, Object> jsonObject = new HashMap<String, Object>();

		//입력받은 제이슨 데이터
		String api_key = request.getParameter("api_key");
		String user_token = request.getParameter("user_token");

		//데이터 유효성 검사
		Raspberry_Setting_VO ras_vo;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("api_key", api_key);
		map.put("user_token", user_token);
		ras_vo = mapper.setting_search(map);

		if (ras_vo != null) {
			System.out.println(ras_vo.toString());
			resultmsg = "setting search success";
			jsonObject.put("resultmsg", resultmsg);
			jsonObject.put("user_id", ras_vo.getUser_id());
			jsonObject.put("ras_name", ras_vo.getRas_name());
			jsonObject.put("ras_watering_operatingtime", ras_vo.getRas_watering_operatingtime());
			jsonObject.put("ras_camera_operatingtime", ras_vo.getRas_camera_operatingtime());

		} else {
			System.out.println("arduino_vo : NULL");
			resultmsg = "setting search fail";
			jsonObject.put("resultmsg", resultmsg);
		}

		return jsonObject;
	}
}
