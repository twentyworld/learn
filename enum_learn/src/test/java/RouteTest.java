import com.learn.Direction;
import com.learn.Enums;
import com.learn.Route;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.junit.Assert.*;
/**
 * Created by teemper on 2017/9/7, 20:42.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class RouteTest {
    private Route route ;
    @Before
    public void setUps(){
        route = new Route();
    }


    @Test
    public void test(){
        Direction direction = Mockito.mock(Direction.class);
        when(direction.getEnums()).thenReturn(Enums.START);
        //when(direction.getEnums().isStart()).thenReturn(true);
        assertEquals(direction.getEnums().isStart(),true);

    }
}
