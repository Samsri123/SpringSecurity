package com.sri.lp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sri.lp.api.EmailDTO;
import com.sri.lp.api.UserInfo;
import com.sri.lp.service.LPAppEmailService;

@Controller
public class EmailController {
	@Autowired
	private LPAppEmailService lPAppEmailService;

	@RequestMapping("/send-email")
	public String sendMail(@ModelAttribute("sendMail") EmailDTO emailDTO, Model model) {

		return "send-mail-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserInfo userInfo,
			@ModelAttribute("sendMail") EmailDTO emailDTO) {
		lPAppEmailService.sendEmail(userInfo.getYourName(),userInfo.getCrushName(), emailDTO.getEmail(), userInfo.getResult());
		return "process-email-page";
	}

}
