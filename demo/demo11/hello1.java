package com.example.demo.demo11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class hello1 {

@RequestMapping("/myweb")
	public String sayhello() {
		return "<h1>welcome to spring boot world!!<h1>";

}
}
