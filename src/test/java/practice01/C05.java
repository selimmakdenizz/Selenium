package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());

        // sayfayi kapatiniz
        driver.close();









    }
}
