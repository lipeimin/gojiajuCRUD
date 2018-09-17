package com.gojiaju.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gojiaju.dao.entity.Sys;
import com.gojiaju.service.SysService;



@RestController
public class SysController {
	
	@Resource
	private SysService sysService;
	
	//查询表里的所有数据
	@RequestMapping(value="/selectAll" , method = RequestMethod.GET)
	public List<Sys> selectAll(){
		List<Sys> s = sysService.selectAll();
		return s;
	}
	
	//根据id查询单个参数
	@RequestMapping(value ="/selectMessageById" , method = RequestMethod.GET)
	public List<Sys> selectMessageById(@RequestParam(value="id",required = false) Long id){
		
		List<Sys> sys = sysService.selectMessageById(id);
		
		return sys;
	}
	
	//插入数据
	@RequestMapping(value ="/insertMessage",method =RequestMethod.POST)
	public int insertMessage(@RequestBody Sys sys){
		int temp = sysService.insertMessage(sys);
		if (0 == temp) {
			return 0000;
		}
		
		return 9999;
	}
	
	
	//更新数据
	@RequestMapping(value="/updateMessage",method=RequestMethod.POST)
	public int updateMessage(@RequestBody Sys sys) {
		int temp =sysService.updateMessage(sys);
		if (0==temp) {
			return 0000;
		}
		
		return 9999;
	}
	
	//根据id删除数据
	@RequestMapping(value="/deleteMessage",method=RequestMethod.POST)
	public int deleteMessage(@RequestParam(value="id" , required=false) Long id) {
		int delFlag = 0; 
		delFlag = sysService.deleteMessage(id);
		if (0==delFlag) {
			System.out.println("删除失败");
		}else {
		System.out.println("删除成功");
		}
		return delFlag;
	
	} 
	 
}
