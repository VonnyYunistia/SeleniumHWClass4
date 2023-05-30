import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class HWClass4 {

    //goto facebook.com
    // click on create account
    //and select the your  date of birth using select class


    public static void main(String[] args) {

        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().window().maximize();

        

        WebElement DD = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//        2.create an object of the select class and pass in the parameters the element dropdown
        Select sel = new Select(DD);

        boolean isMul = sel.isMultiple();
        System.out.println("the drop down is multi select :" + isMul);

        //        select by visible text
        sel.selectByVisibleText("Jun");

//        select by value
        sel.selectByValue("6");

        //        selected by index
        sel.selectByIndex(5);

        WebElement DD1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));

//        select by visible text
        sel.selectByVisibleText("20");

        //        select by value
        sel.selectByValue("20");

        //        selected by index
        sel.selectByIndex(19);

        WebElement DD2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));

        //        select by visible text
        sel.selectByVisibleText("1975");

        //        select by value
        sel.selectByValue("1975");

        //        selected by index
        sel.selectByIndex(47);



    }
}