package com.learn.mybatis;

import com.learn.mybatis.dao.UserDao;
import com.learn.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: mybatis
 * @description
 * @author: Mr.Yang
 * @create: 2021-07-16 11:49
 **/
public class test {

    @Test
    public void test_findUserById() throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //执行sql语句
        User user = mapper.selectUser(1);
        //打印结果
        System.out.println(user); //释放资源 sqlSession.close();

    }

}
