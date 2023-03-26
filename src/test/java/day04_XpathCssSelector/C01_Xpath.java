package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/


        driver.get("https://amazon.com");

        //Search(ara) “city bike”

        /*
        <input type="text" id="nav-bb-search" title="Search For"
        value="" name="field-keywords" autocomplete="off">
        XPATH SYNTAX:
        //tag name[@attributeName='attributeDeğeri']
         //input[@id='twotabsearchtextbox']

           */

        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        //Hybrid bikes bölümüne tıklayın
        /*
        (//*[@class='a-size-base a-color-base'])[11] --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz
        //*[text()='Hybrid Bikes'] --> xpath ile locate alırken html kodlarında attribute name olmayan <tagname class=değeri>text()
        metin varsa bu şekilde locate edebiliriz
         */
          // <span class="a-size-base a-color-base">hybrid bike</span>

       WebElement hybridBike= driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
       System.out.println(hybridBike.isDisplayed());//WE görüntüleniyormu ? -->Görüntülenebiliyor True
        System.out.println(hybridBike.isEnabled());//WE erişilebiliyormu ? --> Erişilebiliyor True
        System.out.println(hybridBike.isSelected());//WE seçilebiliyormu ? --> Seçilemiyor False
        hybridBike.click();

        //Sadece sonuc sayısını yazdıralım
 /*
        //*[text()='15 results for']
        (//*[@class='a-section a-spacing-small a-spacing-top-small'])[1] --> 15 results for "city bike"
         */


        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        driver.findElement(By.xpath("(//*[@class='a-link-normal s-no-outline'])[1]")).click();
        //Sayfayı kapatınız
        driver.close();



    }
}
