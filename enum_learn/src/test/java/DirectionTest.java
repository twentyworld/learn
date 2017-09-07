import com.learn.Direction;
import com.learn.Enums;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
/**
 * Created by teemper on 2017/9/7, 20:39.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class DirectionTest {

    private Direction direction;

    @Before public void setUps(){
        direction = new Direction();
    }
    @Test
    public void test(){

        //Enums enums = Mockito.mock(Enums.class);
        //Enums enums1 = new Enums()
        Enums enums = Enums.LEARN;
        when(direction.getEnums()).thenReturn(enums);
        when(enums.isStart()).thenReturn(true);

        assertEquals(direction.getEnums().isStart(),true);

    }

}
