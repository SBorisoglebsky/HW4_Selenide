package guru.ga;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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

        $("span[data-content='Wiki']").click();

        $(".wiki-more-pages-link button").click();
        $("#wiki-pages-box").shouldHave(Condition.text("SoftAssertions"));
        $("#wiki-pages-box ").find(byText("SoftAssertions")).click();

        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}
