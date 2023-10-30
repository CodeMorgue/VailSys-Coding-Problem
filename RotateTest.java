import org.junit.*;

public class RotateTest {

    public int testArray[] = {1,2,3,4,5,6,7};

    @Test
    public void testRotateLeftByOne(){
        // Create Rotate object
        Rotate rotation = new Rotate();

        // Declare the final expected array
        int finalArray[] = {2,3,4,5,6,7,1};

        // Rotate the testArray to the left by one
        rotation.rotateLeftByOne(testArray, 7);

        // Assert that the array has been correctly rotated by one position to the left
        Assert.assertArrayEquals(finalArray, rotation.objArray);
    }

    @Test
    public void testRotateLeft(){
        // Create Rotate object
        Rotate rotation = new Rotate();

        // Declare final expected array
        int finalArray[] = {5,6,7,1,2,3,4};

        // Rotate testArray to the left by four
        rotation.rotateLeft(testArray, 4, 7);

        // Assert that the array has been correctly rotated by one position to the left
        Assert.assertArrayEquals(finalArray, rotation.objArray);
    }

    @Test
    public void testPrintArray(){
        // Create Rotate object
        Rotate rotation = new Rotate();

        // Assert that the array has been correctly printed
        Assert.assertEquals("1, 2, 3, 4, 5, 6, 7, ", rotation.printArray(testArray, 7));

    }
}
