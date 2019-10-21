package com.example.Spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Spring.model.Student;

public interface Repo extends CrudRepository<Student, Integer>
{
	
}
