package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import janitriLoginPage.base.SetUp;

public class LoginPage extends SetUp{
	public LoginPage(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='formEmail']")
	private WebElement UserID;
	public void enterUserID()
	{
		UserID.sendKeys("");
	}
	@FindBy(xpath="//input[@id='formPassword']")
	private WebElement Password;
	public void enterPassword()
	{
		Password.sendKeys("");
	}
	@FindBy(xpath="//img[@class='passowrd-visible']")
	private WebElement eyeimage;
	public boolean imagevisibility()
	{
		return eyeimage.isDisplayed();
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	public void clickonLogin()
	{
		loginButton.click();
	}
	@FindBy(xpath="//img[@class='login-janitri-logo']")
	private WebElement Title;
	public boolean titleVisibility()
	{
		return Title.isDisplayed();
	}
	

}
