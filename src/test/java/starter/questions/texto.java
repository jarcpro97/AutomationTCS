package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

public class texto {

    public static Question<String> description(By element) {
        return actor -> Text.of(element)
                .viewedBy(actor).asString();
    }
}
