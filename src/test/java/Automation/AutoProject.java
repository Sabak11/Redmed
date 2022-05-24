package Automation;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class AutoProject {
    @Test

    public void test(){
        // Configuration.baseUrl = "https://redmed.ge/ka";
        //Selenide.open("/user/auth-user");
        Selenide.open("https://ee.ge");
        Configuration.browserSize = "1360x768";
       //SelenideElement selector = $(byText("ავტორიზაცია"));
        $(".btn-register mb-2 mr-4").click();


    }
}
