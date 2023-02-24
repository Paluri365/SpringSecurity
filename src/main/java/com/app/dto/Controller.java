package com.app.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/getmsg")
	public String getmsg() {
		return" Welcome to Spring security";
	}
}
