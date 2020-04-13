package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important - Addition."})
public class WhenAddingNumbers {

    @Steps
    MathWizSteps michael;

    @Test
    @Title("Adding numbers - ADDITION")
    public void addingSums() {

        michael.environmentDetails(System.getProperty("testENV").toUpperCase());

        michael.applicationDetails(System.getProperty("appName").toUpperCase());
        // Given
        michael.startsWith(1);

        // When
        michael.adds(2);

        // Then
        michael.shouldHave(3);


    }
}
