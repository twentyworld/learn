package factory.FactoryMethod.factory.impl;

import factory.FactoryMethod.factory.ShapeFactory;
import factory.FactoryMethod.product.Shape;
import factory.FactoryMethod.product.impl.Square;

/**
 * Created by teemper on 2018/9/18, 1:30.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Square();
    }

}