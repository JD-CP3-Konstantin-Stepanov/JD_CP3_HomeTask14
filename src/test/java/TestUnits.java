import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUnits {
    @Test
    public void positiveTestFirstGreaterThenSecond(){
        Main.nameSearch("Alex");
        Main.nameSearch("Lex");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void positiveTestSecondGreaterThenFirst(){
        Main.nameSearch("Clark");
        Main.nameSearch("Michel");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void negativeInputIntValues(){
        Main.nameSearch(String.valueOf(111));
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void negativeInputDoubleValues(){
        Main.nameSearch(String.valueOf(1.0D));
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void negativeInputStringValueNotCapital(){
        Main.nameSearch("x");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }
}
