import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFilinClass {
    Feline feline = new Feline();

    //проверка семейства
    @Test
    public void testIsFelineTest() {
        assertEquals("Виды не совпали", "Кошачьи", feline.getFamily());

    }

    //проверка потребляемой еды
    @Test
    public void testFelineEatsMeet() throws Exception {
        assertEquals("Кошачьи едят не это", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    //проверка возвращаемого значения котят методом без параметров
    @Test
    public void testFelineReturnsKittensCountWithoutParameters() {
        assertEquals("Количество котят не совпало", 1, feline.getKittens());
    }

    //проверка возвращаемого значения котят методом с параметрами
    @Test
    public void testFelineReturnsKittensCountWithParameters() {
        assertEquals("Количество котят не совпало", 5, feline.getKittens(5));
    }


}
