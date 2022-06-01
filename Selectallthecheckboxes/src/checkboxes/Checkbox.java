package checkboxes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/");
			Thread.sleep(2000);

			//Clicking all the checkboxes
			driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
			List<WebElement> allboxes=driver.findElementsByXPath("//input[@type='checkbox']");
			for (WebElement webElement : allboxes)
			{
				//To click the unchecked checkboxes only
				//webElement.click();
				
				//To click all the checkboxes and if the checkboxes is already selected that will not be affected and it will not be unchecked
				if(!webElement.isSelected())
				{	
					webElement.click();
				}
			}
			//Print the No.of.Checkboxes
			int size=allboxes.size();
			System.out.println("No.of.checkboxes are: " +size);
			Thread.sleep(2000);
			driver.close();
		}
	}




