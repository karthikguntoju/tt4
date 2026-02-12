package com.example.karthik;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.karthik.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
