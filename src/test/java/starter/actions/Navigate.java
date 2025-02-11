package starter.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class Navigate {
    public static Performable to(Class<? extends PageObject> page){
        return Task.where("{0} opens the page",
                Open.browserOn().the(page));
    }
}
