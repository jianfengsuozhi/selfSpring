package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * json
 * 	ResponseBody 无  转发
 * 				  有  当前页面返回
 * ajax
 * @author Edward
 *
 */
@Controller
@RequestMapping("/mvc")
public class JsonController {
	//将返回数据转化为json
	@ResponseBody
	@RequestMapping("/json")
	public Person get(){
		Person p = new Person();
		p.setAge(23.1);
		p.setName("魏德亮");
		System.out.println(p);
		//{"name":"魏德亮","age":23.1}
		return p;
	}
	
	@RequestMapping("/json1")
	public Person get1(){
		Person p = new Person();
		p.setAge(23.1);
		p.setName("魏德亮");
		//HTTP Status 404 - /selfSpring/mvc/mvc/json1.jsp
		return p;
	}
}
