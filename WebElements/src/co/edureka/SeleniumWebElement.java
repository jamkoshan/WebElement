package co.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco F1");
		Thread.sleep(4000);
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.className(
				"a-m-us a-aui_72554-c a-aui_control_group_273125-c a-aui_dropdown_274033-c a-aui_link_rel_noreferrer_noopener_274172-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_preload_261698-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate"))
				.click();
		driver.navigate().to("https://www.edureka.co/blog");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.quit();
	}

}
