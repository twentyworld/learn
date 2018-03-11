package springApplicationListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by temper on 2018/2/5,下午11:46.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */

@SpringBootApplication
public class UserApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);

    }


    @Autowired
    UserApplicationPublisher userApplicationPublisher;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        userApplicationPublisher.publishEvent(new UserApplicationEvent(this,new User(12,"name")));
    }
}
