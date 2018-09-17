package factory.AbstractFactory.factory;

import factory.AbstractFactory.product.Button;
import factory.AbstractFactory.product.Text;

/**
 * Created by teemper on 2018/9/18, 1:33.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public interface AbstractFactory {

    public Button createButton();

    public Text createText();

}