import com.xieps.spring.hello.dao.impl.UserDaoImpl;
import com.xieps.spring.hello.dao.impl.UserMySqlDaoImpl;
import com.xieps.spring.hello.pojo.Hello;
import com.xieps.spring.hello.service.UserService;
import com.xieps.spring.hello.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/16 20:40
 */
public class MyTest {

    @Test
    public  void testUserInfo(){

        //默认信息获取
//        UserService userService = new UserServiceImpl();
//        userService.getUserInfo();

        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserMySqlDaoImpl());
        userService.setUserDao(new UserDaoImpl());
        userService.getUserInfo();




    }

    @Test
    public void testHello(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println("hello = " + hello+"\n"+"hello_str="+hello.getStr());
    }


    @Test
    public void test2(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");

        userServiceImpl.getUserInfo();

    }

}
