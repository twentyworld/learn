package basicAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2018/3/7, 23:31.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @GetMapping("/test")
    public String test() {
        return "success";
    }

    @GetMapping("/")
    public String home() {
        return "succ";
    }

}
