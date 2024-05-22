import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestsCats {
    @Mock
    private Feline feline;

    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();

        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = cat.getFood();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expectedFood, actualFood);
    }
}
