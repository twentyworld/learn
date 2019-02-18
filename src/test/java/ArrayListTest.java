import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by teemper on 2019/2/18, 21:31.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class ArrayListTest {


    @Test
    public void testListDeleteWithIndex() {
        List<Integer> list = immutuablelist();

        for (int i = 0; i <list.size();i++) {
            if (list.get(i)==1) list.remove(i);
        }
        System.out.println(list);
        Assert.assertEquals(list.toString(), "[1, 2, 3, 1]");

    }

    @Test
    public void testListDeleteWithObject() {
        List<Integer> list = immutuablelist();

        for (int i = 0; i <list.size();i++) {
            if (list.get(i)==1) list.remove(list.get(i));
        }
        System.out.println(list);
        Assert.assertEquals(list.toString(), "[2, 3, 1, 1]");

    }

    @Test(expected = ConcurrentModificationException.class)
    public void testListDeleteWithForLoop() {
        List<Integer> list = immutuablelist();

        for (Integer integer: list) {
            if (integer==1) list.remove(integer);
        }

    }

    @Test
    public void testListDeleteWithInterator() {
        List<Integer> list = immutuablelist();
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            if (iterator.next()==1) iterator.remove();
        }

        Assert.assertEquals(list.toString(), "[2, 3]");


    }




    private List<Integer> immutuablelist() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);

        return list;
    }

}
