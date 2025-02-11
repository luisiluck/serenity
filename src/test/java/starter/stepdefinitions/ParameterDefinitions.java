package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.pages.PageObject;
import org.reflections.Reflections;

import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @ParameterType(".*")
    public Class<? extends PageObject> page(String pageName) {
        var classes = new Reflections("starter.pages").getSubTypesOf(PageObject.class);
        return classes.stream().filter(clazz -> clazz.getSimpleName().equalsIgnoreCase(pageName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Class not found"));
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
