package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.*;

public class CheckVisaRequirementStatusSteps {

    HomePage homePage;
    NationalityDetailsPage nationalityDetailsPage;
    VisaReasonPage visaReasonPage;
    VisitFamilyOptionPage familyOptionPage;
    DurationOfStayPage durationOfStayPage;
    VisaRequirementStatusDetailsPage visaStatusPage;

    @Step
    public void openUKVisaHomePage(){
        homePage.open();
        homePage.clickAcceptCookies();
    }

    @Step
    public void selectNationality(String countryName){
        nationalityDetailsPage.selectNationality(countryName);
    }

    @Step
    public void selectVisaPurpose(String purpose){
        clickNextStep();
        visaReasonPage.selectReason(purpose);
    }

    @Step
    public void selectLengthOfStay(boolean isStayMoreThan6M){
        clickNextStep();
        durationOfStayPage.selectDurationOfStay(isStayMoreThan6M);
    }

    @Step
    public void selectFamilyVisitOption(String option){
        clickNextStep();
        familyOptionPage.selectVisitFamilyOption(option);
    }

    @Step
    public void clickNextStep(){
        nationalityDetailsPage.clickNextStep();
    }

    @Step
    public void verifyVisaStatusMessage(String message){
        visaStatusPage.verifyVisaStatusMessage(message);
    }

}
