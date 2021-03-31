import org.junit.Assert;
import org.junit.Test;

public class SolutionsTest {

    private final Solutions SOLUTION = new Solutions();

    @Test
    public void shouldReturnFizzForNumDivisibleByThree(){
        Assert.assertEquals("fizz", SOLUTION.fizzBuzz(12));
    }

    @Test
    public void shouldReturnBuzzForNumDivisibleByFive(){
        Assert.assertEquals("buzz", SOLUTION.fizzBuzz(25));
    }
    @Test
    public void shouldReturnFizzBuzzForNumDivisibleByFiveAndThree(){
        Assert.assertEquals("fizzBuzz", SOLUTION.fizzBuzz(15));
    }
}