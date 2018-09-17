package factory.simple.factory;

import factory.simple.product.Shape;
import factory.simple.product.impl.Circle;
import factory.simple.product.impl.Rectangle;
import factory.simple.product.impl.Square;

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
public class ShapeFactory {

    public Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        } else if ("rectangle".equals(type)) {
            return new Rectangle();
        } else if ("square".equals(type)) {
            return new Square();
        } else {
            return null;
        }
    }

}