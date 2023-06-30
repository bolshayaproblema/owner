package qa.guru.owner.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends TestBase {
    @Test
    void githubTest() {
        open("/");
        $(".eyebrow-banner .pr-3 .color-fg-subtle").shouldHave(text("Your AI pair programmer is leveling up"));

    }
}
