package org.project;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass{
	public Pom() {
	PageFactory.initElements(driver, this);
}
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement btnSubmit;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobut;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement btncont;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement credit;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	public WebElement getCansel() {
		return Cansel;
	}
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement btnbook;
	
	@FindBy(name ="my_itinerary")
	private WebElement btniternary;
	
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement Cansel;
	
	public WebElement getItchkbox() {
		return itchkbox;
	}
	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement cancel;
	
	@FindBy(xpath = "//input[@value='304176']")
	private WebElement itchkbox;
	
	@FindBy(xpath = "//input[@value='Logout']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getBtniternary() {
		return btniternary;
	}

	public WebElement getBtnbook() {
		return btnbook;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getBtncont() {
		return btncont;
	}

	public WebElement getRadiobut() {
		return radiobut;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
