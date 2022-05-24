package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Redmed {

    @Test
    public void redmedReg(){
        //Selenide.open("https://redmed.ge/");
        //Configuration.browserSize = "1920x1080";
        //SelenideElement selecttxt = $(byText ("ავტორიზაცია"));
        //SelenideElement selecttxt1 = $ (by ("src", "https://redmed.ge");
        //$("#login-button").shouldHave(Condition.text("შემდეგი"),Duration.ofMillis(5000));
        regPage();
        $("#userName").setValue("Giga");
        $("#userName").shouldNot(Condition.empty);
        $("#lastName").setValue("Kikadze");
        $("#lastName").shouldNot(Condition.empty);
        $("#mobileNumber").setValue("555717701");
        $("#mobileNumber").shouldNot(Condition.empty);
        $("#email").setValue("giga@gmail.com");
        $("#email").shouldNot(Condition.empty);
        $(byLinkText("ისარგებლე მოწვევის კოდით")).click();
        $(byLinkText("წესებს")).click();
        $("#referralCode").setValue("4454");
        $("#terms").click();
        sleep(3000);
        $(byLinkText("ავტორიზაცია")).click();

        sleep(5000);




    }

    @Test
    public void regname(){

        regPage();
        $(byText("რეგისტრაცია")).shouldHave(Condition.visible);
        $("#userName").click();
        $("#lastName").click();
        $("#userNameError").shouldBe(Condition.visible, Duration.ofMillis(5000));
        $("#lastName").click();
        $("#mobileNumber").click();
        $("#lastNameError").shouldBe(Condition.visible);
        $("#email").click();
        $("#phonePatientError").shouldBe(Condition.visible);
        $(byLinkText("ისარგებლე მოწვევის კოდით")).click();
        $(".ng-invalid").shouldBe(Condition.visible);
        $("#email").setValue("test");
        $("#email").setValue("test@");
        $("#email").setValue("test@gmail");
        $("#referralCode").setValue("4454555");
        $(byText("რეფერალ კოდი არასწორია")).shouldHave(Condition.visible);

        $("#user-registration-button").scrollIntoView(true);
        $("#user-registration-button").click();
        $(byText("გთხოვთ, დაეთანხმოთ წესებს და პირობებს")).shouldHave(Condition.visible);

        sleep(5000);

    }



    public void regPage(){

        Selenide.open("https://redmed.ge");
        $(byText ("ავტორიზაცია")).click();
        $(byText ("პაციენტი")).click();
        $(By.linkText("რეგისტრაცია")).click();
        $(byText("რეგისტრაცია")).shouldHave(Condition.visible);


    }


}
