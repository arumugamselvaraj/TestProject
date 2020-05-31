package radio_button.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import project.base.Base;

public class RadioButtons extends Base {
	
	boolean checked=false;
	
	public void RadioButtons()
	{
	
	List<WebElement> RadioButtons=driver.findElements(By.name("marital"));

	for(int i=0;i<RadioButtons.size();i++)
	{
	checked=RadioButtons.get(i).isSelected();
	if(!checked)
	{
	RadioButtons.get(i).click();
	
	}

	}

	}
}
	


