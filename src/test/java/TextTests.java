import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextTests {
   // @BeforeAll
    //static void beforeAll(){
    //    Configuration.browserSize="1920x1080";
   // }

    @Test
    void successTest(){
      open("https://demoqa.com/text-box");

      $("#userName").setValue("Alex");
        $("#userEmail").setValue("dasda@mail.ru");
        $("#currentAddress").setValue("my adress");
        $("#permanentAddress").setValue("another adress");
        $("#submit").scrollTo().click();
        $("#output").shouldBe(visible);

        $("#name").shouldHave(text("Alex"));
        $("#email").shouldHave(text("dasda@mail.ru"));
        $("#output #currentAddress").shouldHave(text("my adress"));
        $("#output #permanentAddress").shouldHave(text("another adress"));



    }




}




