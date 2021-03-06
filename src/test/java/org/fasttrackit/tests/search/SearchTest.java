package org.fasttrackit.tests.search;

import org.fasttrackit.steps.HeaderSteps;
import org.fasttrackit.tests.TestBase;
import org.fasttrackit.tests.TestUtils;
import org.fasttrackit.webviews.ProductGrid;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.fasttrackit.DriverFactory.getDriver;

public class SearchTest extends TestBase {
    @Test
    public void searchWithOneKeywordTest() {

        String keyword = "vase";

        HeaderSteps headerSteps = new HeaderSteps();
        headerSteps.search(keyword);

try {
    Thread.sleep(3000);

}
catch (InterruptedException err){
    System.out.println("Results did not contain keyword");
}
    }

    @Test
    public void mouseOverDemo() {
        TestUtils.mouseOverAndClickLast(By.linkText("WOMEN"), By.linkText("New Arrivals"));

        ProductGrid productGrid = PageFactory.initElements(getDriver(), ProductGrid.class);
        productGrid.getSortBySelectList().selectByVisibleText("Name");
    }
}

