package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class OtpBankPage {
    private final SelenideElement
            searchIconContact = $("span.n-header-desk-only-element"),
            resultShouldBe = $(withText("8 800 200 7004")),
            searchEnVersion = $("span.n-header-top-menu-list__item-text"),
            checkBankDetails = $$("div.main-menu__item").findBy(text("Bank details")),
            checkBankInfo = $$("a.header-top__link").findBy(text("About us")),
            checkResultAddress = $(withText("Leningradskoe highway")),
            checkCredits = $$("ul.n-header-main-nav-menu").findBy(text("Кредиты")),
            checkCreditResults = $(withText("Кредит на автомобиль")),
            checkCards = $$("ul.n-header-main-nav-menu").findBy(text("Дебетовые карты")),
            checkDebitResults = $(withText("Перевод с карты на карту")),
    checkButton = $("a.n-header-btn");

    public OtpBankPage openPage() {
        open(baseUrl);
        return this;
    }

    public OtpBankPage clickContactIcon() {
        searchIconContact.click();
        return this;
    }

    public OtpBankPage checkResultNumber() {
        resultShouldBe.shouldBe(Condition.exist);
        return this;
    }

    public OtpBankPage searchEn() {
        searchEnVersion.click();
        return this;
    }

    public OtpBankPage checkBank() {
        checkBankDetails.click();
        return this;
    }

    public OtpBankPage checkAddress() {
        checkResultAddress.shouldBe(Condition.exist);
        return this;
    }

    public OtpBankPage checkInfo() {
        checkBankInfo.click();
        return this;
    }
    public OtpBankPage checkDebitMenu() {
        checkDebitResults.shouldBe(Condition.exist);
        return this;
    }

    public OtpBankPage checkline() {
        checkCredits.hover();
        return this;
    }

    public OtpBankPage checkMenu() {
        checkCreditResults.shouldBe(Condition.exist);
        return this;

    }

    public OtpBankPage checkDebit() {
        checkCards.hover();
        return this;

    }
    public OtpBankPage checkButtonForClick() {
        checkButton.shouldBe(exist);
        return this;
    }
}
