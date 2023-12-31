package test;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OtpBankPage;

import static io.qameta.allure.Allure.step;


public class OtpBankPageTest extends TestBase {
    OtpBankPage otpBankPage = new OtpBankPage();

    @Test
    @Tag("all-test")
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка наличия номера телефона для Premium клиентов в меню Контакты")
    void checkNumberPhoneTest() {
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
    @Tag("all-test")
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка EN версии сайта ")
    void checkEnVersionTest() {
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
            otpBankPage.checkAddress();
        });

    }

    @Test
    @Tag("all-test")
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка элемента выпадющего списка в меню Кредиты ")
    void checkCreditTest() {
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
    @Tag("all-test")
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка элемента выпадющего списка в меню Дебетовые карты")
    void checkDebitCardsTest() {
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
    @Tag("all-test")
    @Owner("Aleksandr Drozenko")
    @DisplayName("Проверка наличие кнопки Интерент банк ")
    void checkButtonTest() {
        step("Открываем главную страницу ОТП Банка", () -> {
            otpBankPage.openPage();
        });
        step("Проверяем на наличие кнопки Интернет-банк", () -> {
            otpBankPage.checkButtonForClick();
        });
    }


}
