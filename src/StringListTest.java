import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringListTest {

    @Test
    void testSize_twoElements() {
        DynamicStringList arrList = new DynamicStringList();

        arrList.add("brady");
        arrList.add("beza");
        int size = arrList.size();

        assertEquals(2, size);
    }

    @Test
    void testSize_elevenElements() {
        DynamicStringList arrList = new DynamicStringList();

        arrList.add("brady");
        arrList.add("beza");
        arrList.add("miku");
        arrList.add("shiroko");
        arrList.add("serika");
        arrList.add("riley");
        arrList.add("saki");
        arrList.add("mizuki");
        arrList.add("airi");
        arrList.add("nonomi");
        arrList.add("emu");
        int size = arrList.size();

        assertEquals(11, size);
    }

    @Test
    void testCapcity_twoElements() {
        DynamicStringList arrList = new DynamicStringList();

        arrList.add("brady");
        arrList.add("beza");
        int capacity = arrList.capacity();

        assertEquals(10, capacity);
    }

    @Test
    void testCapcity_elevenElements() {
        DynamicStringList arrList = new DynamicStringList();

        arrList.add("brady");
        arrList.add("beza");
        arrList.add("miku");
        arrList.add("shiroko");
        arrList.add("serika");
        arrList.add("riley");
        arrList.add("saki");
        arrList.add("mizuki");
        arrList.add("airi");
        arrList.add("nonomi");
        arrList.add("emu");
        int capacity = arrList.capacity();

        assertEquals(20, capacity);
    }

    @Test
    void testGet_realElement() {
        DynamicStringList arrList = new DynamicStringList();

        arrList.add("brady");
        arrList.add("beza");
        String value = arrList.get(0);

        assertEquals("brady", value);
    }

}