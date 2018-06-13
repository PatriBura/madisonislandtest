package org.fasttrackit.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.fasttrackit.DriverFactory.getDriver;

public class TestUtils {

    public static void mouseOverAndClickLast(By firstLocator, By secondLocator) {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(firstLocator)).perform();
        System.out.println("Executed mouse over on ");
        actions.click(getDriver().findElement(secondLocator))
                .perform();
        System.out.println("Clicked " + secondLocator + "element revealed after mouse over");
    }
}
