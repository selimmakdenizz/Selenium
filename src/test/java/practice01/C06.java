package practice01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C06 {
    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();



        // pencere konumunu ve pencere olcusunu yazdiriniz

        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());

        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim

        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(900,600));


        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
        System.out.println("Sayfa yeni konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfa yeni boyutu: "+driver.manage().window().getSize());
    }
}
