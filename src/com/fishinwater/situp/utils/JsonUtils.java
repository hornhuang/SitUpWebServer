package com.fishinwater.situp.utils;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonUtils {

	public static <T> String arrayToJsonStr(List<T> list) {
		if (list != null) {
			return JSON.toJSONString(list);
		}
		return "";
	}
	
	public static <T> List<T> jsonStrtoList(Class<T> clazz, String jString) {
		List<T> list = new ArrayList<T>();
		list = JSONObject.parseArray(jString, clazz);
		return list;
	}
	
}
