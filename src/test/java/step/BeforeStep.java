package step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class BeforeStep {

    MainPage mainPage = new MainPage();

    @Given("Открываем сайт {string}")
    public void openWebSite(String url) {
        Selenide.open(url);
    }

    @When("Выбрал пункт меню {string}")
    public void chooseMainMenuElement(String elementValue) {
        mainPage.elementsFormsBookmarks.findBy(Condition.text(elementValue)).click();
    }

    @When("Выбрал вкладку {string}")
    public void chooseSubMenuElement(String elementValue) {
        mainPage.shownElementsSubBookMarks.findBy(Condition.text(elementValue)).click();
    }
}
