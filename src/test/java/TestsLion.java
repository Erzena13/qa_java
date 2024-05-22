import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestsLion {
    @Mock
    private Feline feline;
    @Test
    public void testLionConstructorThrowsExceptionForInvalidSex() {
        try {
            new Lion("Некорректный пол", feline);
            Assert.fail("Expected exception was not thrown");
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void testLionGetKittens() throws Exception {
        // Создаем экземпляр класса Lion
        Lion lion = new Lion("Самец", new Feline());

        // Получаем количество котят
        int actualKittensCount = lion.getKittens();

        // Ожидаем, что метод getKittens() возвращает 1
        int expectedKittensCount = 1;
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void testLionGetFood() throws Exception {
        // Устанавливаем ожидаемое поведение для метода getFood()
        when(feline.getFood("Хищник")).thenReturn(List.of("Птицы"));

        Lion lion = new Lion("Самец", feline);

        List<String> expectedFood = List.of("Птицы");
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
