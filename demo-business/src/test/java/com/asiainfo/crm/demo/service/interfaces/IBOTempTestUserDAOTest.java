package com.asiainfo.crm.demo.service.interfaces;

import com.ai.appframe2.service.ServiceFactory;
import org.junit.Before;
import org.junit.Test;
import resource.so.bo.BOTempTestUserBean;
import resource.so.ivalues.IBOTempTestUserValue;

import java.sql.Timestamp;

public class IBOTempTestUserDAOTest {

    private IBOTempTestUserSV iboTempTestUserSV;

    @Before
    public void setUp() throws Exception {
        if (iboTempTestUserSV == null) {
            iboTempTestUserSV = (IBOTempTestUserSV) ServiceFactory.getService(IBOTempTestUserSV.class);
        }
    }

    @Test
    public void testAddUsers() throws Exception {
        IBOTempTestUserValue iboTempTestUserValue = (IBOTempTestUserValue) new BOTempTestUserBean();
//        iboTempTestUserValue.setId();
        iboTempTestUserValue.setAddr("浙江杭州");
        iboTempTestUserValue.setAge(25L);
        iboTempTestUserValue.setBirthday(new Timestamp(System.currentTimeMillis()));
        iboTempTestUserValue.setMail("zxc@gmail.com");
        iboTempTestUserValue.setName("zjy8");
        iboTempTestUserValue.setQq("111111");
        iboTempTestUserValue.setSex("男");
        iboTempTestUserValue.setTel("155555555");
        iboTempTestUserSV.addUsers(iboTempTestUserValue);
    }

    @Test
    public void testDelUsers() throws Exception {
        iboTempTestUserSV.delUser(new long[] {22L});
    }

    @Test
    public void testUpdateUser() throws Exception {
        BOTempTestUserBean boTempTestUserBean = iboTempTestUserSV.getUserById(4L);
        boTempTestUserBean.setAddr("南京");
        boTempTestUserBean.setName("xiaolio");
        iboTempTestUserSV.updateUser((IBOTempTestUserValue) boTempTestUserBean);
    }

    @Test
    public void testGetUserById() throws Exception {
        BOTempTestUserBean boTempTestUserBean = iboTempTestUserSV.getUserById(4L);
        System.out.println(boTempTestUserBean.getName());
    }

    @Test
    public void testGetUsers() throws Exception {
        BOTempTestUserBean[] users = iboTempTestUserSV.getUserList(0L,"",0,"男","","","","",null,0,999);
        for (BOTempTestUserBean user:users
             ) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void testGetUsersCount() throws Exception{
        int count = iboTempTestUserSV.getUserCount(0L,"",0,"男","","","","",null);
        System.out.println(count);
    }
}