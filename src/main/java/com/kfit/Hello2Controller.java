package com.kfit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

	
	@RequestMapping("/helloNew")
	public String helloNew(){
		return "helloNew 哈哈嘻嘻嘻";
	}
	
}
