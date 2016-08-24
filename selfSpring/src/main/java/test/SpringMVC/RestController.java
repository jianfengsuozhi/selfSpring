package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 客户端http请求
 * 		不同请求对应不同操作 增删改查（post,delete,put,get）
 * 		请求_method从put,post(post,put,delete)
 * restful 
 * @author Edward
 */
@Controller
@RequestMapping("/mvc")
public class RestController {
	//@PathVariable url变量
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id")Integer id){
		System.out.println("获取值,id="+id);
		return "rest";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.POST)
	public String post(@PathVariable("id")Integer id){
		System.out.println("新增值,id="+id);
		return "rest";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String put(@PathVariable("id")Integer id){
		System.out.println("修改值,id="+id);
		return "rest";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id")Integer id){
		System.out.println("删除值,id="+id);
		return "rest";
	}
	
	
}
