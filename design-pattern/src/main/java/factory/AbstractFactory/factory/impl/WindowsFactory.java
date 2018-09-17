package factory.AbstractFactory.factory.impl;

import factory.AbstractFactory.factory.AbstractFactory;
import factory.AbstractFactory.product.Button;
import factory.AbstractFactory.product.Text;
import factory.AbstractFactory.product.impl.WindowsButton;
import factory.AbstractFactory.product.impl.WindowsText;

/**
 * Created by teemper on 2018/9/18, 1:34.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Text createText() {
        return new WindowsText();
    }

}