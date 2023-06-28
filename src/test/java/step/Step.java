package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$x;

public class Step {

    @And("Заполнил поле {string} значением {string}")
    public void setFormFiled(String fieldName, String fieldValue) {
        $x("//form/div[.//label[text()='" + fieldName + "']]//*[contains(@class,'form-control')]").setValue(fieldValue);
    }

    @Then("Экран оставновился для демонстрации результата в течении {int} секунд")
    public void showResultsScreen(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
    }
}
