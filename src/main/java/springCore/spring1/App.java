package springCore.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/Bean.xml");
       Car car=  applicationContext.getBean(Car.class);
       car.drive();
    }
}
