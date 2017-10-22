package com.techkit.database.dao;

import java.util.List;

import com.techkit.database.baen.User;

public interface IUserDao {
    /**
     * 增加用户信息
     * @param user
     * @return
     */
    public boolean insert(User user);
    
    /**
     * 删除用户信息
     * @param user
     * @return
     */
    public boolean delete(User user);
    
    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public boolean update(User user);
    
    /**
     * 查询用户信息
     * @param user
     * @return
     */
    public List<User> queryByUser(User user);
}
