import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

	@Test 
	public void testReverseInPlaceTwo() {
    int[] input1 = { 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3 }, input1);
	}

	@Test 
	public void testReverseInPlaceThree() {
    int[] input1 = { 6, 7, 8, 9, 10 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 10, 9, 8, 7, 6 }, input1);
	}


	@Test 
	public void testMinArray() {
    double[] input1 = { 1.0, 1.0, 1.0, 1.0 };
    double d = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(1.0, d, 0.0001);
	}
}
