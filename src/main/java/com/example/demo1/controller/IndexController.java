package com.example.demo1.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	
	//跨域请求虽然前台报错但实际上已经访问到了后台的服务，解开下面的crossorigin注释就相当于对任何来源的请求都不做拦截
	//除此方法之外还可以使用过滤器方式来解决跨域
	//可以配参数来限定特定的domain，但注意domain端口后面不能有/
//	@CrossOrigin
//	@CrossOrigin(origins = "http://127.0.0.1:8848",maxAge = 3600,methods = {RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="/getIndexMesg", method = RequestMethod.POST)
	public Map<String, Object> getMesg(@RequestParam Map<String, Object> param,HttpServletResponse response) {
//		可以通过配置response的header实现允许跨域访问
//		response.addHeader("Access-Control-Allow-Origin", "http://127.0.0.1:8848");
//		response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println(param.get("mesg").toString());
		return param;
	}
}
