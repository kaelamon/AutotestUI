import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Example {
    public static void main(String[] args) {

    }
    @Test
    public void GoogleSearchForPerfomanceLab() {
        open("https://www.google.ru"); // ���������� ����
        $("input").shouldBe(visible); //�� ������ ������ ���� ���������
        $("input").setValue("performance lab").pressEnter(); //����� �������� ����� � ������� �����
        $(byText("https://www.performance-lab.ru")).shouldBe(visible).click(); //������ �� ������ ������� � ���� ����� �� �����������
        switchTo().window(1); //��������� �� ����� ������� ������� ���������
        $x("//img[@alt='��������� ��� Logo']").shouldBe(visible); //������� ��� ���� ���������� �� �����
    }
    @Test
    public void ServicesButtonIsBlue() {
        open("https://www.performance-lab.ru"); // ���������� ����
        $(byId("menu-item-317")).shouldBe(visible);
        $(byId("menu-item-317")).hover();
        $(byXpath("//a[@href='/website-testing']"), 1).shouldBe(visible).click();
        switchTo().window(1);
        $(".elementor-3212").shouldBe(visible);
        String color = $x("//a[@href='#1']").getCssValue("background-color");
        assertEquals(color, "rgba(79, 173, 255, 1)"); //��������� ��� �� RGBA ���� ������������ ������
    }

    @Test
    public void ScrollAndOpenForm(){
        open("https://www.performance-lab.ru");
        $(byId("menu-item-317")).shouldBe(visible);
        $(byId("menu-item-317")).hover();
        $(byXpath("//a[@href='https://www.performance-lab.ru/avtomatizacija-testirovanija']"), 1).shouldBe(visible).click();
        $(byText("������� ����������� ��������")).shouldBe(visible).scrollTo(); //�������, ��� ���� ���� ��, ������ ��� ������� ���������� ��� �������� ����� �������
        $x("//img[@loading='lazy']").click();
        $(byClassName("hubspot-modal-container")).shouldBe(visible);
        sleep(5000); //�� ������ ������ ��������� ���� ����� ���������
    }
}
