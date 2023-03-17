/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.dao.impl;

import com.todoapp.dao.ITodoDAO;
import com.todoapp.models.Todo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author This PC
 */
public class TodoDAOImpl implements ITodoDAO {
    private JdbcTemplate jdbctemplate;

    public TodoDAOImpl(DataSource dataSource) {
        this.jdbctemplate = new JdbcTemplate(dataSource);
    }

    
    

    @Override
    public List<Todo> list() {
        String sql = "select * from Todos";
        List<Todo> list = jdbctemplate.query(sql, new RowMapper<Todo>() {
            public Todo mapRow(ResultSet rs, int rowNum) throws SQLException{
                Todo todo = new Todo();
                todo.setId(rs.getInt("id"));
                todo.setTodoTitle(rs.getString("todoTitle"));
                todo.setTodoContent(rs.getString("todoContent"));
                return todo;
            }
        });
        return list;
    }
    
    
//    public static void main(String[] args){
//        TodoDAOImpl todoDao = new TodoDAOImpl();
//        System.out.println(todoDao.list());
//    }
    
    
}
