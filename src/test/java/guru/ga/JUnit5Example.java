package guru.ga;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5Example {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.startMaximized = true;
    }

    @Test
    void searchJUnit5(){
        open("/selenide/selenide");
        $("h1").shouldHave(Condition.text("selenide / selenide"));

      //  $("span").find(byText("\"Wiki\"")).click();
        $(byXpath("//span[text()='Wiki']")).click();

        sleep(5000);

    }
}
