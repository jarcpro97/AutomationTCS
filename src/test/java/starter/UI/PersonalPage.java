package starter.UI;

import org.openqa.selenium.By;

public class PersonalPage {

    public static By FIRST_NAME = By.id("firstName");
    public static By LAST_NAME = By.id("lastName");
    public static By EMAIL = By.id("email");
    public static By BIRTH_MONTH = By.id("birthMonth");
    public static By BIRTH_DAY = By.id("birthDay");
    public static By BIRTH_YEAR = By.id("birthYear");
    public static By BOTON_NEXT = By.xpath("//a[@href='#']");
    public static By CITY = By.id("city");
    public static By ZIP_CODE = By.id("zip");
    public static By INPUT_VERSION = By.xpath("//input[@placeholder='Select a Version']");
    public static By INPUT_LENGUAGE = By.xpath("//input[@placeholder='Select OS language']");
    public static By INPUT_MOBILE = By.xpath("//input[@placeholder='Select Brand']");
    public static By INPUT_MODEL = By.xpath("//input[@placeholder='Select a Model']");
    public static By INPUT_SYSTEM = By.xpath("//input[@aria-owns='ui-select-choices-8']");
    public static By SELECT_COUNTRY = By.xpath("//span[@aria-label='Select a country']");
    public static By SELECT_VERSION = By.xpath("//span[@aria-label='Select a Version']");
    public static By SELECT_LENGUAGE = By.xpath("//span[@aria-label='Select OS language']");
    public static By SELECT_MOBILE = By.xpath("//span[@aria-label='Select Brand']");
    public static By SELECT_MODEL = By.xpath("//span[@aria-label='Select a Model']");
    public static By SELECT_SYSTEM = By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]");
    public static By PASS = By.id("password");
    public static By CONF_PASS = By.id("confirmPassword");
    public static By CHECK_TERMS = By.xpath("//span[@class='checkmark signup-consent__checkbox error']");
    public static By CHECK_PRIVACITY = By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static By TITLE_REGISTERED = By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]");

















}
