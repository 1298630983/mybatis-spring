package cc.jasonos.mybatis.test;

import cc.jasonos.mybatis.mapper.UserMapper;
import cc.jasonos.mybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Jason on 2017/10/15.
 */
public class TestMapper {

    @Test
    public void testMapper() throws Exception {

       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserMapper mapper = ac.getBean(UserMapper.class);

//		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
       User user = mapper.findUserById(10);
       System.out.println(user);


    }

}
