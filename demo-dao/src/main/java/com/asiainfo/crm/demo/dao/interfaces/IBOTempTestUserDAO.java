package com.asiainfo.crm.demo.dao.interfaces;

import com.ai.appframe2.util.criteria.Criteria;
import resource.so.bo.BOTempTestUserBean;

/**
 * 临时测试类
 *
 * @author wangwei
 */
public interface IBOTempTestUserDAO {

    /**
     * 新增用户
     *
     * @param iboTempTestUserValue
     * @throws Exception
     */
    void addUsers(resource.so.ivalues.IBOTempTestUserValue iboTempTestUserValue) throws Exception;

    /**
     * 删除用户
     *
     * @param boTempTestUserBeans
     * @throws Exception
     */
    void delUsers(BOTempTestUserBean[] boTempTestUserBeans) throws Exception;

    /**
     * 更新用户
     *
     * @param iboTempTestUserValue
     * @throws Exception
     */
    void updateUser(resource.so.ivalues.IBOTempTestUserValue iboTempTestUserValue) throws Exception;

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
     * @param sql      查询语句
     * @param startNum 起始下标
     * @param endNum   结束下标
     * @return
     * @throws Exception
     */
    BOTempTestUserBean[] getUsers(Criteria sql, int startNum, int endNum) throws Exception;

    /**
     * 查询用户数量
     *
     * @param sql
     * @return
     * @throws Exception
     */
    int getUserCount(Criteria sql) throws Exception;

}
