package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important - Subtraction."})
public class WhenSubtractingNumbers {

    @Steps
    MathWizSteps paul;

    @Test
    @Title("Subtracting numbers - SUBTRACTION")
    public void addingSums() {

        paul.environmentDetails(System.getProperty("testENV").toUpperCase());

        paul.applicationDetails(System.getProperty("appName").toUpperCase());
        // Given
        paul.startsWith(2);

        // When
        paul.adds(1);

        // Then
        paul.shouldHave(1);


    }
}
