package test;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OtpBankPage;

import static io.qameta.allure.Allure.step;

@Tag("all-test")
public class OtpBankPageTest extends TestBase {
    OtpBankPage otpBankPage = new OtpBankPage();

    @Test
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка наличия номера телефона для Premium клиентов в меню Контакты")
    void checkNumberPhone() {
        step("Открываем главную страницу ОТП Банка", () -> {
            otpBankPage.openPage();
        });
        step("Кликаем по меню Контакты", () -> {
            otpBankPage.clickContactIcon();
        });
        step("Проверяем наличие телефона для Premium клиентов", () -> {
            otpBankPage.checkResultNumber();
        });
    }

    @Test
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка EN версии сайта ")
    void checkEnVersion() {
        step("Открываем главную страницу ОТП Банка", () -> {
            otpBankPage.openPage();
        });
        step("Кликаем по Английской версии сайта", () -> {
            otpBankPage.searchEn();
        });
        step("Переходим в меню About us ", () -> {
            otpBankPage.checkInfo();
        });
        step("Переходим в меню Bank Details ", () -> {
            otpBankPage.checkBank();
        });
        step("Проверяем наличие улицы на английском языке", () -> {
            otpBankPage.checkAddrres();
        });

    }

    @Test
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка элемента выпадющего списка в меню Кредиты ")
    void checkCredit() {
        step("Открываем главную страницу ОТП Банка", () -> {
            otpBankPage.openPage();
        });
        step("Находим мышью ссылку Кредиты", () -> {
            otpBankPage.checkline();
        });
        step("Проверяем на наличие строки Кредит на автомобиль ", () -> {
            otpBankPage.checkMenu();
        });

    }

    @Test
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка элемента выпадющего списка в меню Дебетовые карты")
    void checkDebitCards() {
        step("Открываем главную страницу ОТП Банка", () -> {
            otpBankPage.openPage();
        });
        step("Находим мышью ссылку Дебетовые карты", () -> {
            otpBankPage.checkDebit();
        });
        step("Проверяем на наличие строки Перевод с карты на карту", () -> {
            otpBankPage.checkDebitMenu();
        });
    }

    @Test
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка наличие кнопки Интерент банк ")
    void checkButton() {
        step("Открываем главную страницу ОТП Банка", () -> {
            otpBankPage.openPage();
        });
        step("Проверяем на наличие кнопки Интернет-банк", () -> {
            otpBankPage.checkButtonForClick();
        });
    }


}
