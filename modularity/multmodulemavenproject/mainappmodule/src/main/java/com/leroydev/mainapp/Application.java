package com.leroydev.mainapp;

import com.leroydev.dao.Dao;
import com.leroydev.entity.User;
import com.leroydev.userdao.UserDao;
import java.util.Map;
import java.util.HashMap;


public class Application
{
    public static void main( String[] args )
    {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        users.put(3, new User("Tommy"));
        Dao userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }
}
