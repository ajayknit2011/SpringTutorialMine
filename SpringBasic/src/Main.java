import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Resource res=new ClassPathResource("web.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		Test t= (Test)factory.getBean("t1");*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
		/*Book book=(Book)context.getBean("b1");
		Book book2=(Book)context.getBean("b1");*/
		 
	/*	System.out.println(book);*/
		Library lib=(Library)context.getBean("lib");
		System.out.println(lib.getBook());
		
		
		//ShowBook showbook=(ShowBook)context.getBean("showbook");
		
				
				

	}

}