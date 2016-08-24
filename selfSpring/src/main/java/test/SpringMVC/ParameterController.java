package test.SpringMVC;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 参数的自动匹配和装箱
 * @author Edward
 *
 */
@Controller
@RequestMapping("/mvc")
public class ParameterController {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hello");
		return "hello";
	}
	
	//自动匹配参数
	@RequestMapping("/person")
	public String toPerson(String name,double age){
		//http://localhost:8088/selfSpring/mvc/person?name=wei&age=123
		//name=wei,age=123.0
		System.out.println("name="+name+",age="+age);
		return "hello";
	}
	
	//自动装箱
	@RequestMapping("/person1")
	public String toPerson(Person person){
		//http://localhost:8088/selfSpring/mvc/person1?name=wei&age=123
		//name=wei,age=123.0
		System.out.println("name="+person.getName()+",age="+person.getAge());
		return "hello";
	}
}
