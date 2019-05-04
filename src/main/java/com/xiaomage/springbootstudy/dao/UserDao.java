package com.xiaomage.springbootstudy.dao;

/**
 * @author xiaomage
 * @date 2019/5/4 - 13:57
 */
public interface UserDao {
    /**
     * 新增用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
