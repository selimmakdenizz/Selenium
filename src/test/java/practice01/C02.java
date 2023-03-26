package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(3000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teknosaTitle=driver.getTitle();
        System.out.println("teknosaTitle:"+teknosaTitle);

        String teknosaUrl=driver.getCurrentUrl();
        System.out.println("teknosaUrl:"+teknosaUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz

        if (teknosaTitle.contains("Teknoloji")){
            System.out.println("Title Teknoloji içeriyor");
        }else {
            System.out.println("Title Teknoloji içermiyor");
        }

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaUrl.contains("teknosa")){
            System.out.println("teknosaUrl teknosa içeriyor");
        }else {
            System.out.println("teknosaUrl teknosa içermiyor");
        }

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(3000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz

        String medunnaTitle=driver.getTitle();
        System.out.println("medunnaTitle:"+medunnaTitle);

        String medunnaUrl=driver.getCurrentUrl();
        System.out.println("medunnaUrl:"+medunnaUrl);


        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title MEDUNNA içeriyor");
        }else {
            System.out.println("Title MEDUNNA içermiyor");
        }

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("Url medunna içeriyor");
        }else {
            System.out.println("Url medunna içermiyor");
        }

        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(3000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(3000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(3000);

        // pencereyi kapat
        driver.close();









    }
}
