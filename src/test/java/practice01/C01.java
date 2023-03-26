package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://amazon.com");

        // "https://www.n11.com/" adresine gidiniz.
       Thread.sleep(3000);
        driver.navigate().to("https://n11.com");

        // amazon adresine geri donunuz
        Thread.sleep(3000);
        driver.navigate().back();

        driver.navigate().forward();
        Thread.sleep(3000);

        // sayfayi yenileyiniz
        driver.navigate().refresh();


        // pencereyi kapat
        driver.close();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("Her Şey yolunda");


    }
}
