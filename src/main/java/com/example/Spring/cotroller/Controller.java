package com.example.Spring.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.Student;
import com.example.Spring.service.ServImpl;

@RestController
public class Controller 
{
	@Autowired
	ServImpl ss;
	
	@RequestMapping(value="/Student",consumes = "Application/json",method = RequestMethod.POST)
	public void save(@RequestBody Student s)
	{
		ss.save(s);
	}
	
	@RequestMapping(value="/Student",consumes = "Application/json",method=RequestMethod.GET)
	public List<Student> getAll()
	{
		return ss.getAll();
	}
	
	@RequestMapping(value="/Student/{id}",method = RequestMethod.DELETE)
	public void dele(@PathVariable int id)
	{
		ss.delID(id);
	}
	
	@RequestMapping(value="/Student/edit",method=RequestMethod.GET)
	public Student getsingleRec(@RequestParam int id)
	{  
				Student s=ss.getSingle(id);
				return s;
	}
	
	@RequestMapping(value="/Student/update",consumes ="Application/json",method=RequestMethod.POST)
	public void updt(@RequestBody Student s)
	{
		ss.update(s);
	}
}
