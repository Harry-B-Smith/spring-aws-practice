package com.highoctane.springaws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class


HomeController {
	String string = "Hi";

	@RequestMapping("/")
	public String showPage() {

		return "helloworld";
	}
}
