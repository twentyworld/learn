package springApplicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by temper on 2018/2/5,下午11:03.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
public class UserApplicationEvent extends ApplicationEvent {

    private User user;

    public UserApplicationEvent(Object source,User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
