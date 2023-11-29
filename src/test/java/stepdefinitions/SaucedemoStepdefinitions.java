package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoPage;

public class SaucedemoStepdefinitions {
   SauceDemoPage sauceDemoPage= new SauceDemoPage();

    @Then("Username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String string) {

    }
    @Then("Password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String string) {

    }
    @Then("Login tusuna basar")
    public void login_tusuna_basar() {

    }
    @When("Ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {

    }
    @When("Add to Cart butonuna basar")
    public void add_to_cart_butonuna_basar() {

    }
    @Then("Alisveris sepetine tiklar")
    public void alisveris_sepetine_tiklar() {

    }
    @Then("Sectigi urunun basarili olarak sepete eklendigini kontrol eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_kontrol_eder() {

    }
}
