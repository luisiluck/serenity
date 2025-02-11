package starter.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.InputField;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://google.com")
public class GooglePage extends PageObject {
    public static final Target SEARCH_FIELD = InputField.withNameOrId("q");

}
