package org.opencart_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opencart_pom {
	public static WebDriver driver;
	@FindBy(xpath = "//a[text()='Features']")
	private WebElement feature;
	@FindBy(xpath = "//h3[text()='Affiliates']")
	private WebElement scroll;
	@FindBy(xpath = "//a[text()='Unlimited everything']")
	private WebElement click_unlimited;
	@FindBy(xpath = "//a[text()='Demo']")
	private WebElement demo;
	@FindBy(linkText = "Official Documentation")
	private WebElement document;

	public WebElement getFeature() {
		return feature;
	}

	public WebElement getScroll() {
		return scroll;
	}
	public WebElement getClick_unlimited() {
		return click_unlimited;
	}
	public WebElement getDemo() {
		return demo;
	}
	public WebElement getDocument() {
		return document;
	}
	public Opencart_pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
}
