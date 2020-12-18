import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
//        userService.save(666, 888);
//        int ret = userService.update();
//        System.out.println("app....."+ret);
//        userService.delete();
        int sum = userService.getSum(100, 100);
        System.out.println("sum="+sum);
    }
}
