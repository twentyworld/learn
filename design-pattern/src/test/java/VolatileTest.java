import org.junit.Test;

/**
 * Created by teemper on 2018/4/30, 0:39.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class VolatileTest {
    @Test
    public void test() {
        final VolatileTest test = new VolatileTest();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<10;j++)
                        test.increase();
                }
            }.start();
            System.out.println(inc);
        }

        while(Thread.activeCount()>1)
            Thread.yield();

        System.out.println("end："+test.inc);
    }

    public volatile int inc = 0;

    public void increase() {
        inc++;
    }
}
