package factory.AbstractFactory.product.impl;

import factory.AbstractFactory.product.Button;

/**
 * Created by teemper on 2018/9/18, 1:32.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class WindowsButton implements Button {

    @Override
    public void processEvent() {
        System.out.println("Inside WindowsButton::processEvent() method.");
    }

}
