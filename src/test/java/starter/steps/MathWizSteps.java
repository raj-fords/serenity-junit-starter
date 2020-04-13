package starter.steps;

import net.thucydides.core.annotations.Step;

public class MathWizSteps {

    String actor;

    @Step("#actor starts with {0}")
    public void startsWith(int amount) {
        // TODO
    }

    @Step("#actor adds {0}")
    public void adds(int amount) {
        // TODO
    }

    @Step("#actor should have {0}")
    public void shouldHave(int expectedTotal) {
        // TODO
    }

    @Step("#actor Environment Details ::: {0}")
    public void environmentDetails(String testENV) {

        System.out.println("ENVIRONMENT DETAILS :::: " + System.getProperty("testENV"));
    }

    @Step("#actor Application Details ::: {0}")
    public void applicationDetails(String appName) {

        System.out.println("APPLICATION DETAILS :::: " + System.getProperty("appName"));
    }

}
