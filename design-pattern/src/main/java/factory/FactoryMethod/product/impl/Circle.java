package factory.FactoryMethod.product.impl;

import factory.FactoryMethod.product.Shape;

/**
 * Created by teemper on 2018/9/18, 1:25.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
