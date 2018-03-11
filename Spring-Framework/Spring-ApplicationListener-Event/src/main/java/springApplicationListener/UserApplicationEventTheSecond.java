package springApplicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by temper on 2018/2/6,上午12:21.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
@Component
public class UserApplicationEventTheSecond implements ApplicationListener<UserApplicationEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(UserApplicationEvent event) {

        User user = event.getUser();
        System.out.println(user);
    }
}
