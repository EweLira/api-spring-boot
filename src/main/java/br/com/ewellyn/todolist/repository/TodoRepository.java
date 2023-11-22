package br.com.ewellyn.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ewellyn.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
