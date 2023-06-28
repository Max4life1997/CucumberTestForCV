package pages;

import com.codeborne.selenide.ElementsCollection;
import pages.fragments.TextBoxForm;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class MainPage {

    public final ElementsCollection elementsFormsBookmarks = $$(".accordion div.element-group");

    public final ElementsCollection shownElementsSubBookMarks = $$x("//div[contains(@class,'element-list collapse show')]/ul/li");
    public final TextBoxForm textBoxForm = new TextBoxForm();

}
