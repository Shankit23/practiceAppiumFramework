package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.MenuPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsPage extends MenuPage{
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
	private WebElement SLBTitle;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]")
	private WebElement SLBTxt;
	
	@AndroidFindBy(accessibility = "test-BACK TO PRODUCTS")
	private WebElement backToProductsBtn;
//	
//	@AndroidFindBy(accessibility = "test-Price")
//	private WebElement SLBPrice;
	
	public String getSLBTitle() {
		String title = getText(SLBTitle, "title is - ");
		return title;
	}
	
	public String getSLBTxt() {
		String txt = getText(SLBTxt, "Text is ");
		return txt;
	}
	
//	public String getSLBPrice() {
//		String price = getText(SLBPrice);
//		System.out.println(price);
//		return price;
//	}
//	
	public String scrollToSLBPriceAnsGetSLBPrice() {
		String price = getText(scrollToElement(), "price is");
		return 	price;
	}
	
	public ProductsPage pressBackToProductsBtn() {
		click(backToProductsBtn, "Clicking on the Back to Product Button");
		return new ProductsPage();
	}

}
