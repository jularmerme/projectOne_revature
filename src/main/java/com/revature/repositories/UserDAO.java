package com.revature.repositories;

import java.util.List;

import com.revature.models.User;

public interface UserDAO {
  public int insert(User user);

  public boolean update(User user);

  public User findById(int id);

  public List<User> findAllEmpByRoleId(int roleId);

  public List<User> findAllUsers();

  public User login(String username, String password);

}