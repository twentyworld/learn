package factory.FactoryMethod.factory;

import factory.FactoryMethod.product.Shape;
import factory.FactoryMethod.product.impl.Circle;
import factory.FactoryMethod.product.impl.Rectangle;
import factory.FactoryMethod.product.impl.Square;

/**
 * Created by teemper on 2018/9/18, 1:26.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public interface ShapeFactory {

    public Shape getShape();

}