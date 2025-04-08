import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringListTest {





@Test
public void testSetInSpecificIndex(){
    DynamicStringList arrList = new DynamicStringList();
        arrList.add("name");
        arrList.add("age");
        arrList.add("hight");

        arrList.set(1, "color");
        assertEquals("color", arrList.get(1));
}

@Test
public void testRemoveFromSpecificIndex(){
    DynamicStringList arrList =new DynamicStringList();
    arrList.add("green");
    arrList.add("black");
    arrList.add("blue");
    arrList.add("yellow");

    String removed =arrList.remove(1);

    //check if it was removed
    assertEquals("black", removed);
    //check size
    assertEquals(3, arrList.size());
    //blue shifted to 1
    assertEquals("blue", arrList.get(1));
    //yellow shifted to 2
    assertEquals("yellow", arrList.get(2));
    
}

}