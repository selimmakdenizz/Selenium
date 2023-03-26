package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();


    driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin

            driver.get("https://www.amazon.com/ ");

        // Kaynak Kodlarini konsola yazdiriniz
            String sayfaKaynakKodları=driver.getPageSource();
        System.out.println(sayfaKaynakKodları);

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
            if (sayfaKaynakKodları.contains("Gateway")){
                System.out.println("kaynak kodlarında gateway yazıyor");
            }else {
                System.out.println("kaynakkodlarında gateway yazmıyor ");
            }



        // sayfayi kapatiniz
        driver.close();


    }
}
