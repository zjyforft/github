package com.asiainfo.crm.demo.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.crm.demo.dao.interfaces.IBOTempTestUserDAO;
import com.asiainfo.crm.demo.service.interfaces.IBOTempTestUserSV;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import resource.so.bo.BOTempTestUserBean;
import resource.so.ivalues.IBOTempTestUserValue;

import java.sql.Timestamp;

/**
 * 用户业务实现类
 */
public class BOTempTestUserSVImpl implements IBOTempTestUserSV {

    private IBOTempTestUserDAO iboTempTestUserDAO;

    private IBOTempTestUserDAO getIBOTempTestUserDAO() {
        if (iboTempTestUserDAO == null) {
            iboTempTestUserDAO = (IBOTempTestUserDAO) ServiceFactory.getService(IBOTempTestUserDAO.class);
        }
        return iboTempTestUserDAO;
    }

    /**
     * 新增用户
     *
     * @param iboTempTestUserValue
     * @return
     */
    @Override
    public void addUsers(IBOTempTestUserValue iboTempTestUserValue) throws Exception {
        this.getIBOTempTestUserDAO().addUsers(iboTempTestUserValue);
    }

    /**
     * 删除用户
     *
     * @param userIds 用户ID列表
     */
    @Override
    public void delUser(long[] userIds) throws Exception {
        if (ArrayUtils.isEmpty(userIds)) {
            return;
        }
        Criteria criteria = new Criteria();
        criteria.addIn(BOTempTestUserBean.S_Id, userIds);
        BOTempTestUserBean[] boTempTestUserBeans = this.getIBOTempTestUserDAO().getUsers(criteria, -1, -1);
        this.getIBOTempTestUserDAO().delUsers(boTempTestUserBeans);
    }


    /**
     * 更新用户信息
     *
     * @param iboTempTestUserValue
     * @throws Exception
     */
    @Override
    public void updateUser(IBOTempTestUserValue iboTempTestUserValue) throws Exception {
        BOTempTestUserBean boTempTestUserBean = this.getIBOTempTestUserDAO().getUserById(iboTempTestUserValue.getId());
        if (boTempTestUserBean == null) {
            return;
        }
        if (!StringUtils.isEmpty(iboTempTestUserValue.getAddr())) {
            boTempTestUserBean.setAddr(iboTempTestUserValue.getAddr());
        }if (!StringUtils.isEmpty(iboTempTestUserValue.getName())) {
            boTempTestUserBean.setName(iboTempTestUserValue.getName());
        }if (!StringUtils.isEmpty(iboTempTestUserValue.getMail())) {
            boTempTestUserBean.setMail(iboTempTestUserValue.getMail());
        }if (!StringUtils.isEmpty(iboTempTestUserValue.getQq())) {
            boTempTestUserBean.setQq(iboTempTestUserValue.getQq());
        }if (!StringUtils.isEmpty(iboTempTestUserValue.getSex())) {
            boTempTestUserBean.setSex(iboTempTestUserValue.getSex());
        }if (!StringUtils.isEmpty(iboTempTestUserValue.getTel())) {
            boTempTestUserBean.setTel(iboTempTestUserValue.getTel());
        }if (!StringUtils.isEmpty(String.valueOf(iboTempTestUserValue.getAge()))) {
            boTempTestUserBean.setAge(Long.parseLong(String.valueOf(iboTempTestUserValue.getAge())));
        } if (!StringUtils.isEmpty(String.valueOf(iboTempTestUserValue.getBirthday()))) {
            boTempTestUserBean.setBirthday(Timestamp.valueOf(String.valueOf(iboTempTestUserValue.getBirthday())));
        }
        this.getIBOTempTestUserDAO().updateUser((IBOTempTestUserValue) boTempTestUserBean);
        // TODO
    }


    /**
     * 查询用户
     *
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public BOTempTestUserBean getUserById(long userId) throws Exception {
        return this.getIBOTempTestUserDAO().getUserById(userId);
    }


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
    @Override
    public BOTempTestUserBean[] getUserList(long id, String name, int age, String sex, String tel,
                                            String mail, String qq, String addr, Timestamp birthday,
                                            int startNum, int endNum) throws Exception {
        Criteria criteria = new Criteria();
        if (id > 0) {
            criteria.addEqual(BOTempTestUserBean.S_Id, id);
        }
        if (StringUtils.isNotBlank(name)) {
            criteria.addLIKE(BOTempTestUserBean.S_Name, "%" + name + "%");
        }
        if (age > 0) {
            criteria.addEqual(BOTempTestUserBean.S_Age, age);
        }
        if (StringUtils.isNotBlank(sex)) {
            criteria.addEqual(BOTempTestUserBean.S_Sex, sex);
        }
        if (StringUtils.isNotBlank(tel)) {
            criteria.addEqual(BOTempTestUserBean.S_Tel, tel);
        }
        if (StringUtils.isNotBlank(mail)) {
            criteria.addLIKE(BOTempTestUserBean.S_Mail, mail);
        }
        if (StringUtils.isNotBlank(qq)) {
            criteria.addLIKE(BOTempTestUserBean.S_Qq, qq);
        }
        if (StringUtils.isNotBlank(addr)) {
            criteria.addLIKE(BOTempTestUserBean.S_Addr, addr);
        }
//        TODO 日期设置
//        if (birthday != null) {
//            criteria.addLIKE(BOTempTestUserBean.S_Birthday, birthday);
//        }
        return this.getIBOTempTestUserDAO().getUsers(criteria, startNum, endNum);
    }

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
    @Override
    public int getUserCount(long id, String name, int age, String sex, String tel,
                            String mail, String qq, String addr, Timestamp birthday) throws Exception {
        Criteria criteria = new Criteria();
        if (id > 0) {
            criteria.addEqual(BOTempTestUserBean.S_Id, id);
        }
        if (StringUtils.isNotBlank(name)) {
            criteria.addLIKE(BOTempTestUserBean.S_Name, "%" + name + "%");
        }
        if (age > 0) {
            criteria.addEqual(BOTempTestUserBean.S_Age, age);
        }
        if (StringUtils.isNotBlank(sex)) {
            criteria.addEqual(BOTempTestUserBean.S_Sex, sex);
        }
        if (StringUtils.isNotBlank(tel)) {
            criteria.addEqual(BOTempTestUserBean.S_Tel, tel);
        }
        if (StringUtils.isNotBlank(mail)) {
            criteria.addLIKE(BOTempTestUserBean.S_Mail, mail);
        }
        if (StringUtils.isNotBlank(qq)) {
            criteria.addLIKE(BOTempTestUserBean.S_Qq, qq);
        }
        if (StringUtils.isNotBlank(addr)) {
            criteria.addLIKE(BOTempTestUserBean.S_Addr, addr);
        }
//        TODO 日期设置
//        if (birthday != null) {
//            criteria.addLIKE(BOTempTestUserBean.S_Birthday, birthday);
//        }
        return this.getIBOTempTestUserDAO().getUserCount(criteria);
    }
}

