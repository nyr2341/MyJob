package com.nyr.todo.list;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoListService {
	private Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	private ToDoListMapper toDoListMapper;
	
	@Autowired
	public ToDoListService( ToDoListMapper toDoListMapper ) {
		this.toDoListMapper = toDoListMapper;
	}
	
	public void asdasd() {
		System.out.println(1111);
	}
	
	public List<Map<String,Object>> getToDoLists() {
		
		
		return null;
		
	}
	
	public Map<String, Object> getToDoListInfo( Map<String, Object> param ) throws Exception {
		return toDoListMapper.selectToDoListInfo(param);
	}
	
	
}
