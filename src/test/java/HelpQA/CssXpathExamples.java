package HelpQA;

public class CssXpathExamples {

     /*
        как искать CSS локаторы пример:

        ‹input type="email" class="inputtext login_form_input_box" name="email" id="email" data_testid="email">
        $( "[data-testid=email]").setValue("1");
        или так:
        $(by("data-testid", "email")).setValue("1");  -  тут мы пишем сначала название отребута потом его значение

        ----------------------------------------------------------------------------------------------------------------

        еще пример:

        ‹input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $( "[id=email]"). setValue("1");
        или
        $( "#email").setValue("1");
        или
        $( "input#email").setValue("1");
        или икспатч
        $x ( "//*[@id='email']"). setValue ("1");
        или
        $x ( "//input[@id='email']"). setValue ("1");

        ----------------------------------------------------------------------------------------------------------------

        еще пример:

        ‹input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        или
        $(byName("email")).setValue("1");

        ----------------------------------------------------------------------------------------------------------------

        еще пример с классами:

        ‹input type="email" class="inputtext login_form_input_box"> тут мы берем самый уникальный класс по описанию
        $( "[class=login_form_input_box]"). setValue("1");
        или
        $( ".login_form_input_box"). setValue("1");
        или
        $( ".inputtext.login_form_input_box"). setValue("1");
        или
        $( ".input.inputtext.login_form_input_box"). setValue("1");
        или икспач
        $x ( "//input[@class='inputtext'][@class='login_form_input_box']"). setValue ("1");
        .а.б так мы ищем два класса одновременно у одного элемента
        .а .б так мы ищем класс .а в котором еще есть класс .б

        ----------------------------------------------------------------------------------------------------------------

        еще пример с поиск по тексту:

        <div>Hallo mom!</div>
        $(byText("Hallo mom!")).click(); //- весь текст
        $(withText("lo mo")).click(); // по частичному совпадению текста
        и икспатч
        $x ( "//div[text()='Hallo mom!']").click();

      */
}
