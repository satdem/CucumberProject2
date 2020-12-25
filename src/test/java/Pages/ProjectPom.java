package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProjectPom extends _Parent{
    WebElement myElement;
    public ProjectPom() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[id='user_login']")
   private WebElement loginButton;

    @FindBy(css = "input[id='user_password']")
   private WebElement password;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
   private WebElement signInButton;
    @FindBy(xpath = "//h2[text()='Cash Accounts']")
   public WebElement loginControl;

   @FindBy(css = "[id='pay_bills_tab']")
   private WebElement payBills;
 @FindBy(xpath = "//a[text()='Add New Payee']")
   private WebElement addNewPayee;

  @FindBy(css = "input[id='np_new_payee_name']")
   private WebElement payeeName;
   @FindBy(css = "textarea[id='np_new_payee_address']")
   private WebElement payeeAddress;
  @FindBy(css = "input[id='np_new_payee_account']")
   private WebElement acount;
  @FindBy(css = "input[id='np_new_payee_details']")
   private WebElement payeeDetails;
  @FindBy(css = "input[id='add_new_payee']")
   private WebElement addButton;


  @FindBy(css = "input[id='np_new_payee_account']")
    private WebElement foreignCrrn ;

    @FindBy(css = "select[id='pc_currency']")
    private WebElement currency ;


    @FindBy(css = "div[id='alert_content']")
   public WebElement controlMsj;

    public void findElementAndSendKeysFunction(String elementName,String value){

        switch (elementName){
            case "loginButton":myElement=loginButton;break;
            case "password":myElement=password;break;
            case "payeeName":myElement=payeeName;break;
            case "payeeAddress":myElement=payeeAddress;break;
            case "acount":myElement=acount;break;
            case "payeeDetails":myElement=payeeDetails;break;
        }

        sendKeysFunction(myElement,value);
    }

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "signInButton":myElement=signInButton;break;
            case "payBills":myElement=payBills;break;
            case "addNewPayee":myElement=addNewPayee;break;
            case "addButton":myElement=addButton;break;
            case "foreignCrrn":myElement=foreignCrrn;break;
            case "currency":myElement=currency;break;
        }
        clickFunction(myElement);
    }

    public void setControlMsj(String elname,String msj){
        switch (elname){
            case "loginControl":myElement=loginControl;
                Assert.assertTrue(myElement.getAttribute("value").toLowerCase().contains(msj.toLowerCase()));
                break;
            case "controlMsj":myElement=controlMsj;
                Assert.assertTrue(myElement.getText().toLowerCase().contains(msj.toLowerCase()));
                break;
        }
    }

}
