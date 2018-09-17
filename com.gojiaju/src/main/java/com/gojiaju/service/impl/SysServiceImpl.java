package com.gojiaju.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gojiaju.dao.SysMapper;
import com.gojiaju.dao.entity.Sys;
import com.gojiaju.service.SysService;

@Service(value = "sysService")
public class SysServiceImpl implements SysService{
	
	@Resource
	private SysMapper sysMapper;
	
	//查询
	public List<Sys> selectAll() {
		List<Sys> s = sysMapper.selectAll();
		return s;
	}
	//插入
	@Override
	public int insertMessage(Sys sys) {
		int s =sysMapper.insertMessage(sys);
		return s;
	}
	//修改
	@Override
	public int updateMessage(Sys sys) {
		int s =sysMapper.updateMessage(sys);
		return s;
	}
	//删除
	@Override
	public  int deleteMessage(Long id) {
		int temp = 0;
		temp = sysMapper.deleteMessage(id);
		return temp;
		
	}
	
	//根据id选择
	@Override
	public List<Sys> selectMessageById(Long id) {
		
		List<Sys> sys = sysMapper.selectMessageById(id);
		return sys;
	}

	
}
