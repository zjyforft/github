package com.asiainfo.crm.demo.service.interfaces;

import resource.so.bo.BOTempTestUserBean;
import resource.so.ivalues.IBOTempTestUserValue;

import java.sql.Timestamp;

/**
 * 用户业务接口
 */
public interface IBOTempTestUserSV {

    /**
     * 新增用户
     *
     * @param iboTempTestUserValue
     * @throws Exception
     */
    void addUsers(IBOTempTestUserValue iboTempTestUserValue) throws Exception;

    /**
     * 删除用户
     *
     * @param userIds 用户ID列表
     * @throws Exception
     */
    void delUser(long[] userIds) throws Exception;

    /**
     * 更新用户信息
     *
     * @param iboTempTestUserValue
     * @throws Exception
     */
    void updateUser(IBOTempTestUserValue iboTempTestUserValue) throws Exception;

    /**
     * 查询用户
     *
     * @param userId
     * @return
     * @throws Exception
     */
    BOTempTestUserBean getUserById(long userId) throws Exception;

    /**
     * 查询用户列表
     *
     * @param id
     * @param name
     * @param age
     * @param sex
     * @param tel
     * @param mail
     * @param qq
     * @param addr
     * @param birthday
     * @param startNum
     * @param endNum
     * @return
     * @throws Exception
     */
    BOTempTestUserBean[] getUserList(long id, String name, int age,
                                     String sex, String tel, String mail,
                                     String qq, String addr, Timestamp birthday,
                                     int startNum, int endNum) throws Exception;

    /**
     * 查询用户数量
     *
     * @param id
     * @param name
     * @param age
     * @param sex
     * @param tel
     * @param mail
     * @param qq
     * @param addr
     * @param birthday
     * @return
     * @throws Exception
     */
    int getUserCount(long id, String name, int age,
                     String sex, String tel, String mail,
                     String qq, String addr, Timestamp birthday) throws Exception;

}
