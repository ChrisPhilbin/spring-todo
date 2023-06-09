package net.chrisphilbin.todo.service;

import java.security.Principal;
import java.util.List;

import net.chrisphilbin.todo.entity.Todo;

public interface TodoService {
    Todo getTodo(Long id);
    Todo saveTodo(Todo todo);
    Todo updateTodo(Todo newTodo, Todo oldTodo);
    void deleteTodo(Long id);
    List<Todo> getTodos(Long userId);
    Boolean verifyTodoBelongsToUser(Todo todo, Principal principal);
}
