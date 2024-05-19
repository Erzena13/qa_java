import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestFelineKittensParameterized {
    private final int inputKittensCount;
    private final int expectedKittensCount;

    public TestFelineKittensParameterized(int inputKittensCount, int expectedKittensCount) {
        this.inputKittensCount = inputKittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {2, 2},
                {3, 3}
        });
    }

    @Test
    public void testFelineGetKittensWithCount() {
        Feline feline = new Feline();
        org.junit.Assert.assertEquals(expectedKittensCount, feline.getKittens(inputKittensCount));
    }
}
