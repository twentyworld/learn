package factory.AbstractFactory;

import factory.AbstractFactory.factory.AbstractFactory;
import factory.AbstractFactory.factory.impl.LinuxFactory;
import factory.AbstractFactory.factory.impl.WindowsFactory;

/**
 * Created by teemper on 2018/9/18, 1:35.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory linuxFactory = new LinuxFactory();
        linuxFactory.createButton().processEvent();
        linuxFactory.createText().getWholeText();

        AbstractFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().processEvent();
        windowsFactory.createText().getWholeText();
    }

}
