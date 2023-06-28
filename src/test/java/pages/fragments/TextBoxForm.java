package pages.fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxForm {

    private final SelenideElement fullNameField = $("#userName");
    private final SelenideElement emailField = $("#userEmail");
    private final SelenideElement currentAddressField = $("#currentAddress");
    private final SelenideElement permanentAddressField = $("#permanentAddress");
}
