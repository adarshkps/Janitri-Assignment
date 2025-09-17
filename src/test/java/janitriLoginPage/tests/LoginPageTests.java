package janitriLoginPage.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import janitriLoginPage.base.SetUp;

public class LoginPageTests extends SetUp{

	LoginPage Lp;
	LoginPageTests()
	{
		super();
		initialization();
		Lp=new LoginPage(driver);
		
	}
	@Test
	public void validatewithblankfields()
	{
		String enterUserID=("");
		String enterPassword=("");
		boolean b= Lp.imagevisibility();
		Lp.clickonLogin();
		Assert.assertEquals(enterUserID,"");
		Assert.assertEquals(enterPassword, "");
		Assert.assertTrue(b);
	}
	@Test
	public void validatewithRandomCredentials()
	{
		String enterUserID=("8235823dhjdgh@gd");
		String enterPassword=("23573509dgj");
		boolean b=Lp.imagevisibility();
		Lp.clickonLogin();
		Assert.assertTrue(b);
	}
	@Test
	public void validateMaskingUnmaskingImage()
	{
		boolean b=Lp.imagevisibility();
		Assert.assertTrue(b);
	}
	@Test
	public void validatingthepresenceOfTitle()
	{
		boolean b=Lp.titleVisibility();
		Assert.assertTrue(b);
	}
	
	
	
	
	
}
