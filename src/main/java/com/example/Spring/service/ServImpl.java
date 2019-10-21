package com.example.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.Student;
import com.example.Spring.repository.Repo;

@RestController
public class ServImpl implements ServIntr 
{
	@Autowired
	Repo r;

	@Override
	public void save(Student s)
	{
		r.save(s);
	}

	@Override
	public List<Student> getAll() 
	{
		List<Student> l=(List<Student>)r.findAll();
		return l;
	}

	@Override
	public void delID(int id) 
	{
		 r.deleteById(id);
	}

	@Override
	public Student getSingle(int id) 
	{
		Optional<Student> s=r.findById(id);
		return s.get();
	}

	@Override
	public void update(Student s)
	{
		r.save(s);
	}
	
}
