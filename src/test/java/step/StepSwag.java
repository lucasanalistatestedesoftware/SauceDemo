package step;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepSwag{
    WebDriver robo;

    @Before
    public void inicial() {
        System.setProperty("webdriver.chrome.driver", "src/drive2023.2/chromedriver.exe");
        robo = new ChromeDriver();
        robo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Dado("que esteja na pagina da {string}")
    public void que_esteja_na_pagina_da(String url) {
        robo.get("https://www.saucedemo.com/");
    }

    @Quando("utiizar username com {string} e password com {string}")
    public void utiizar_username_com_e_password_com(String string, String string2) {
        robo.findElement(By.id("user-name")).sendKeys(string);
        robo.findElement(By.id("password")).sendKeys(string2);
    }

    @Quando("clica no botão login")
    public void clica_no_botão_login() {
        robo.findElement(By.id("login-button")).click();
    }

    @Então("deve ter {string}")
    public void deve_ter(String resultado) {

        if (resultado.equals("sucesso"))
            Assertions.assertEquals("https://www.saucedemo.com/inventory.html",
                    robo.getCurrentUrl());
        if (resultado.equals("bloqueio"))
            Assertions.assertEquals("Epic sadface: Sorry, this user has been locked out.",
                    robo.findElement(By.tagName("h3")).getText());
        if (resultado.equals("problema"))
            Assertions.assertEquals("Sauce Labs Backpack",
                    robo.findElement(By.id("item_4_title_link")).getText());
    }
}
