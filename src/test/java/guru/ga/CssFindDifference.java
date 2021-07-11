package guru.ga;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CssFindDifference {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.startMaximized = true;
    }

    @Test
    void findH1Div(){
        open("/selenide/selenide");

        SelenideElement element1 = $("div h1");
       if (element1.exists()) {
            System.out.println(element1.getTagName());
        }
        SelenideElement element2 = $("div").$("h1");
        if (element2.exists()) {
            System.out.println(element2.getTagName());
        }
    }
}
/*Поиск по $("div h1") находит элемент div, внутри которого h1 существует
    Поиск по $("div").$("h1") находит первый div на странице и далее внутри пытается найти h1
А его нет , тест не заходит в второй if
Резюме. Разница действительно есть*/
