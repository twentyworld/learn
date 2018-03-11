package springApplicationListener;

        import org.springframework.context.ApplicationListener;
        import org.springframework.context.annotation.Scope;
        import org.springframework.stereotype.Component;

/**
 * Created by temper on 2018/2/5,下午11:02.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
@Component
public class UserApplicationListener implements ApplicationListener<UserApplicationEvent> {

    @Override
    public void onApplicationEvent(UserApplicationEvent event) {
        User user = event.getUser();
        System.out.println(user);
    }
}
