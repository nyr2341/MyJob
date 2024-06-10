package com.nyr.todo.list;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyr.todo.page.PageDTO;

@RestController
@RequestMapping(value="/")
public class ToDoListController {
	private Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	private ToDoListService toDoListService;
	
	@Autowired
	public ToDoListController( ToDoListService toDoListService ) {
		this.toDoListService = toDoListService;
	}
	
	@GetMapping("")
	public Map<String, Object> getToDoLists( PageDTO pageDto ) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> serviceMap = new HashMap<String, Object>();
		
		try {
			toDoListService.getToDoListInfo( serviceMap );
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return resultMap;
	}
	
	@GetMapping("{idx}")
	public Map<String, Object> getToDoListInfo(@PathVariable("idx") Integer idx) {
		Map<String, Object> serviceMap = new HashMap<String, Object>();
		
		try {
			toDoListService.getToDoListInfo( serviceMap );
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return null;
	}

	@PostMapping("")
	public Map<String, Object> regToDoList() {
		return null;
	}
	
}
