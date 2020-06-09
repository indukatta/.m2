package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class VisitFamilyOptionPage extends PageObject {

    public void selectVisitFamilyOption(String option){
        $(By.xpath("//input[@value='"+ option.toLowerCase() +"']")).click();
    }
}
