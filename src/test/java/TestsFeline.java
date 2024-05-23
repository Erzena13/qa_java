import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestsFeline {
    @Mock
    private Feline feline;

    @Test
    public void testFelineEatMeat() throws Exception {
        // Создаем настоящий объект класса Feline
        Feline feline = new Feline();

        // Проверяем, что метод eatMeat() возвращает ожидаемый список еды для настоящего объекта
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testRealFelineGetFamily() {
        // Создаем настоящий объект класса Feline
        Feline realFeline = new Feline();

        // Проверяем, что метод getFamily() возвращает ожидаемое значение для настоящего объекта
        String expectedFamily = "Кошачьи";
        String actualFamily = realFeline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void testFelineGetKittens() {
        // Устанавливаем ожидаемое значение для метода getKittens()
        when(feline.getKittens()).thenReturn(1);

        // Проверяем, что метод getKittens() возвращает ожидаемое количество котят
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
