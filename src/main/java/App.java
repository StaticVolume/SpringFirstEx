import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHelloBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstHelloBean.getMessage());
        HelloWorld secondHelloBean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(secondHelloBean.getMessage());

        System.out.println("-----------------------------------------------------------------------------------------");
        
        System.out.println("Обьекты класса HelloWorld одинаковы? : " + (firstHelloBean == secondHelloBean)
                + "\n"
                + "Ссылка на первый обьект = "
                + firstHelloBean
                + "\n"
                + "Ссылка на второй обьект = "
                + secondHelloBean);

        System.out.println("-----------------------------------------------------------------------------------------");

        Cat firstCat = applicationContext.getBean("cat", Cat.class);
        firstCat.setName("Барсик");
        firstCat.setAge( (byte) 2);
        firstCat.catSay();

        Cat secondCat = applicationContext.getBean("cat", Cat.class);
        firstCat.setName("Мурзик");
        firstCat.setAge( (byte) 1);
        firstCat.catSay();

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Обьекты класса Cat одинаковы? : "
                + (applicationContext.getBean("cat", Cat.class) == applicationContext.getBean("cat",Cat.class))
                + "\n"
                + "Ссылка на первый обьект класса Cat = "
                + firstCat
                + "\n"
                + "Ссылка на второй обьект класса Cat = "
                + secondCat);
    }
}