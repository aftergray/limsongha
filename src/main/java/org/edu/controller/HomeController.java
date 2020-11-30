package org.edu.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 * 앱을 위한 홈페이지 요청(request)을 처리한다
 * 
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 루트/ 라는 이름으로 요청 받으면, home.jsp 파일에 화면출력(렌더링)이 됩니다.
	 */
	
	
	@RequestMapping(value="/weare",method = RequestMethod.GET)
	public String weare() {
		return "sample/weare";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET) //절대경로
	public String index() {
		return "sample/index"; 
	}
	@RequestMapping(value = "/work", method = RequestMethod.GET) //절대경로
	public String work() {
		return "sample/work"; 
	}
	@RequestMapping(value = "/contact", method = RequestMethod.GET) //절대경로
	public String contact() {
		return "sample/contact"; 
	}
	@RequestMapping(value = "/contact", method = RequestMethod.POST) //절대경로
	public String contact_send() {
		return "redirect:/blog"; 
	}
	@RequestMapping(value = "/blog", method = RequestMethod.GET) //절대경로
	public String blog() {
		return "sample/blog"; 
	}
		
		
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("환영합니다 현재 여러분 컴퓨터 언어는 {}.", locale);
		logger.info("환영합니다 현재 여러분 컴퓨터 언어는 " + locale + "입니다");
		//loger = 디버깅용, 콘솔에 뿌려줌
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//model 이라는 클래스형 변수를 이용해 변수값을 home.jsp에 연동
		//이곳에서 추가한 serverTime 이라는 변수를 home.jsp에서 사용할수있단말
		return "home";*/
	
	
}
