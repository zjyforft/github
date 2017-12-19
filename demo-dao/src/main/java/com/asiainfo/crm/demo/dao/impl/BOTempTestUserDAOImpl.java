package com.asiainfo.crm.demo.dao.impl;

import com.ai.appframe2.util.criteria.Criteria;
import resource.so.bo.BOTempTestUserBean;
import com.asiainfo.crm.demo.bo.BOTempTestUserEngine;
import com.asiainfo.crm.demo.dao.interfaces.IBOTempTestUserDAO;
import resource.so.ivalues.IBOTempTestUserValue;
import org.apache.commons.lang.ArrayUtils;

public class BOTempTestUserDAOImpl implements IBOTempTestUserDAO {

    /**
     * 新增用户
     *
     * @param iboTempTestUserValue
     * @return
     */
    @Override
    public void addUsers(IBOTempTestUserValue iboTempTestUserValue) throws Exception {
        if (iboTempTestUserValue.isNew()) {
            iboTempTestUserValue.setId(BOTempTestUserEngine.getNewId().longValue());
        }
        BOTempTestUserEngine.save((BOTempTestUserBean) iboTempTestUserValue);
    }

    /**
     * 删除用户
     *
     * @param boTempTestUserBeans
     * @throws Exception
     */
    @Override
    public void delUsers(BOTempTestUserBean[] boTempTestUserBeans) throws Exception {
        if (ArrayUtils.isEmpty(boTempTestUserBeans)) {
            return;
        }
        for (BOTempTestUserBean boTempTestUserBean : boTempTestUserBeans) {
            boTempTestUserBean.delete();
        }
        BOTempTestUserEngine.save(boTempTestUserBeans);
    }

    /**
     * 更新用户
     *
     * @param iboTempTestUserValue
     */
    @Override
    public void updateUser(IBOTempTestUserValue iboTempTestUserValue) throws Exception {
        BOTempTestUserEngine.save((BOTempTestUserBean) iboTempTestUserValue);
    }

    /**
     * 查询用户
     *
     * @param userId
     * @return
     */
    @Override
    public BOTempTestUserBean getUserById(long userId) throws Exception {
        return BOTempTestUserEngine.getBean(userId);
    }

    /**
     * 查询用户列表
     *
     * @param sql      查询语句
     * @param startNum 起始下标
     * @param endNum   结束下标
     * @return
     * @throws Exception
     */
    @Override
    public BOTempTestUserBean[] getUsers(Criteria sql, int startNum, int endNum) throws Exception {
        if (sql.isEmpty()) {
            return new BOTempTestUserBean[0];
        }
        return BOTempTestUserEngine.getBeans(sql, startNum, endNum, false);
    }

    /**
     * 查询用户数量
     *
     * @param sql
     * @return
     * @throws Exception
     */
    public int getUserCount(Criteria sql) throws Exception {
        return BOTempTestUserEngine.getBeans(sql).length;
    }

}
