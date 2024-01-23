package SerchWord;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public  class MyFirstProgram {

    @Test
    void SearchWordGitHub() {
        Configuration.holdBrowserOpen = true;


        //Открыть страницу селенида в ГитХабе
        open("https://github.com/selenide/selenide");
        //Перейти в раздел Wiki
        $("#wiki-tab").shouldHave(text("Wiki")).click();
        //Убедиться что в списке страниц есть SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        //Открыть эту страницу, убелиться что там есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));


    }
}






