import java.util.Arrays;
import java.util.List;
import org.junit.*;


public class InsertionSortTests {
    Main.InsertionSort ob = new Main.InsertionSort();
    @Test
    public void sortTest() {
        int[] arr = { 12, 11, 13, 5, 6 };
        int[] expectedArr = { 5, 6, 11, 12, 13 };
        ob.sort(arr);

        Assert.assertArrayEquals(expectedArr,arr);
    }

    @Test
    public void sortedArrayTest() {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] expectedArr = {10, 20 , 30, 40, 50};
        ob.sort(arr);
        Assert.assertArrayEquals(expectedArr,arr);
    }

    @Test
    public void zerosSortTest() {
        int[] arr = { 0,0,0,0,0 };
        int[] expectedArr = {0,0,0,0,0};
        ob.sort(arr);
        Assert.assertArrayEquals(expectedArr,arr);
    }

    @Test
    public void withNegativeNumbersTest() {
        int[] arr = { -3, -20, -2, -8, 1, 0 };
        int[] expectedArr = {-20, -8, -3, -2, 0, 1};
        ob.sort(arr);
        Assert.assertArrayEquals(expectedArr,arr);
    }

    @Test
    public void emptyArrayTest() {
        int[] arr = { };
        int[] expectedArr = { };
        ob.sort(arr);
        Assert.assertArrayEquals(expectedArr,arr);
    }



}
