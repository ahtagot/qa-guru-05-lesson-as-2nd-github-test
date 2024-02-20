import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionsEnterpriseGithubTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1280x720";
        Configuration.baseUrl = "https://github.com";
      //  Configuration.pageLoadStrategy = "eager";

    }


    @Test
    void CheckEnterprisePageIsLoaded() {
// На главной странице GitHub выберите меню Solutions -> Enterprize
        open("/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();

// Убедитесь что загрузилась нужная страница
        $(".application-main").shouldHave(text("To build, scale, and deliver secure software."));

    }
}
