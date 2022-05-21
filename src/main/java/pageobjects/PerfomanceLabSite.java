package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PerfomanceLabSite {
    public String PerfomanceLabLink = "https://www.performance-lab.ru";                                                 // сайт перфа
    public SelenideElement perfomanceLabImg() {
        return $x("//img[@alt='Перфоманс Лаб Logo']");                                                     //картинка перфа
    }
    public SelenideElement hoverMenu() {
        return $(byId("menu-item-317"));                                                                                //Меню "Услуги"
    }
    public SelenideElement hoverMenuWebTestingLink() {
        return $(byXpath("//a[@href='/website-testing']"), 1);                                                    //элемент "Тестирование сайта"
    }
    public SelenideElement getAPrice() {
        return $(".elementor-3212");                                                                           //Кнопка "узнать цену"
    }
    public String getAPriceBackground() {
        return $x("//a[@href='#1']").getCssValue("background-color");                                   //Цвет кнопки "узнать цену"
    }
    public SelenideElement autoTestingLink() {
        return $(byXpath("//a[@href='https://www.performance-lab.ru/avtomatizacija-testirovanija']"), 1);         //элемент "Автоматизация тестирвоани" по линку
    }
    public SelenideElement workExamplesElement() {
        return $(byText("Примеры выполненных проектов"));                                                     //элемент "Примеры выполненных проектов" найденый по тексту
    }
    public SelenideElement lazyImg() {
        return $x("//img[@loading='lazy']");                                                               //Картинка под текстом "Примеры выполненных проектов"
    }
    public SelenideElement hubspotElement() {
        return $(byClassName("hubspot-modal-container"));                                                               //элемент окна обратногой связи З.Ы. когда он закрыт hubspot-modal-container меняет имя на hubspot-modal-container closed
    }
}
