package com.sri.lp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sri.lp.api.UserInfo;
import com.sri.lp.service.LPAppService;

@Controller
@SessionAttributes("userInfo")
public class LPAppController {
	@Autowired
	private LPAppService lpAppService;
	
	@RequestMapping("/")
	public String homePage(Model model) {
//		Cookie[] cookies = request.getCookies();
//		for (Cookie tempCookie : cookies) {
//			if ("yourName".equals(tempCookie.getName())) {
//				String yourName = tempCookie.getValue();
//				userInfo.setYourName(yourName);
//			}
//		}
		// Needed for @SessionAttributes("userInfo")
		model.addAttribute("userInfo", new UserInfo());

		return "home-page";
	}

	@RequestMapping("/process-result")
	public String processResult(@Valid @ModelAttribute("userInfo") UserInfo userInfo, BindingResult result,
			HttpServletResponse response, HttpServletRequest request) {
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError tempError : errors) {
				System.out.println(tempError);
			}
			return "home-page";
		}
//		// Creating Cookie
//		Cookie theCookie = new Cookie("yourName", userInfo.getYourName());
//		theCookie.setMaxAge(60 * 60 * 24);
//
//		// Adding Cookie
//		response.addCookie(theCookie);

//		// creating session object
//		HttpSession session = request.getSession();
//		// setting the attribute value
//		session.setAttribute("yourName", userInfo.getYourName());
		String appResult=lpAppService.calculateLove(userInfo.getYourName(),userInfo.getCrushName());
		userInfo.setResult(appResult);
		return "result-page";
	}
}
