package com.nyr.todo.list;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nyr.todo.page.PageDTO;

@Mapper
public interface ToDoListMapper {

	public List<Map<String, Object>> selectToDoLists( @Param("page") PageDTO pageDto );
	
	
	public Map<String, Object> selectToDoListInfo( Map<String, Object> param );
	
}
