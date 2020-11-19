package com.example.demo1.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@RequestMapping("/hello")
	public String hello(String param){
		System.out.println(param);
		return"Hello world!";
	}
	
	@RequestMapping("/getHelloList")
	public List<String> helloList(String param){
		String a = "a";
		String b = "b";
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		return list;
	}
	
	@RequestMapping("/getJsonObject")
	public Map<String, Object> jsonObject(String param){
		System.out.println("get request");
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		String a = "a";
		String b = "b";
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		data.put("list", list);
		map.put("name", "hello");
		map.put("data", data);
		return map;
	}
}
