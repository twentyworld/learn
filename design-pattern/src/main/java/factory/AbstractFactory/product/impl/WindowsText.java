package factory.AbstractFactory.product.impl;

import factory.AbstractFactory.product.Text;

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

public class WindowsText implements Text {

    @Override
    public void getWholeText() {
        System.out.println("Inside WindowsText::getWholeText() method.");
    }

}