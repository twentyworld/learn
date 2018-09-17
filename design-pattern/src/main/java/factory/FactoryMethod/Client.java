package factory.FactoryMethod;

import factory.FactoryMethod.factory.ShapeFactory;
import factory.FactoryMethod.factory.impl.CircleFactory;
import factory.FactoryMethod.factory.impl.RectangleFactory;
import factory.FactoryMethod.factory.impl.SquareFactory;

/**
 * Created by teemper on 2018/9/18, 1:27.
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
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.getShape().draw();
        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.getShape().draw();
        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.getShape().draw();
    }

}
