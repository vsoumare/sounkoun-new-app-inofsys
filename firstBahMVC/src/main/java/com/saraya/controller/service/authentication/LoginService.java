package com.saraya.controller.service.authentication;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean isValid(String user, String password) {
		return user.equals("sounkoun") && password.equals("code");
	}
}
