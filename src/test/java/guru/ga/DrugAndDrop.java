package guru.ga;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DrugAndDrop {
    @Test
    void checkDrugAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo($("#column-b"));

        $("#column-a header").shouldHave(text("B"));

    }

}
