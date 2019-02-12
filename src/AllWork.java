import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllWork {
	AllWork(WebDriver dr, String u){
		dr.get(u);
	}
	AllWork(WebDriver dr, By v, String u){
		dr.findElement(v).sendKeys(u);
	}
	AllWork (){
		
	}
	
	
	
	public void click(WebDriver dr, By x) {
	dr.findElement(x).click();
	
}
	public void getUrl(WebDriver dr, String url) {
		dr.get(url);
	}
	
	public void clickElement (WebDriver dr, By c, String b) {
		dr.findElement(c).sendKeys(b);
	}
	
}
