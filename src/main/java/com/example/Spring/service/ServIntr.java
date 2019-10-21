package com.example.Spring.service;

import java.util.List;

import com.example.Spring.model.Student;

public interface ServIntr 
{
	public void save(Student s);
	
	public List<Student> getAll();
	
	public void delID(int id);
	
	public Student getSingle(int id);
	
	public void update(Student s);
}
