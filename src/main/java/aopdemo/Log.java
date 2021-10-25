package aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class  Log{
	
	@Before("execution( public void addStudent())")
	public void start() {
		System.out.println("Add_Student method started....");
	}
	
	@After("execution( public void addStudent())")
	public void end() {
		System.out.println("Add_Student method ended.....");
	}

}
