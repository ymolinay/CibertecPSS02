package cucumber.stepdefs;

import cucumber.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarritoStepDefs {
    private static WebDriver driver;
    private PaginaCarrito paginaCarrito;
    private PaginaLogin paginaLogin;
    private PaginaInventario paginaInventario;
    private PaginaInventarioItem paginaInventarioItem;
    private PaginaPagar paginaPagar;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        System.out.println("setup");
    }

    @Given("Estoy en la pagina del carrito")
    public void estoyEnLaPaginaCarrito() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        paginaLogin = new PaginaLogin(driver);
        paginaLogin.ingresarUsername("standard_user");
        paginaLogin.ingresarPassword("secret_sauce");
        paginaLogin.clickBotonLogin();
        paginaInventario = new PaginaInventario(driver);
        paginaInventario.clickAddToCartOrRemoveButtonAtIndex(0);
        paginaInventario.clickAddToCartOrRemoveButtonAtIndex(1);
        paginaInventario.clickAddToCartOrRemoveButtonAtIndex(2);
        paginaInventario.clickCartIcon();
    }

    @When("Hago clic en el titulo del producto")
    public void clicEnTituloDelProducto() {
        paginaCarrito = new PaginaCarrito(driver);
        paginaCarrito.clickItemAtIndex(2);
    }

    @Then("Ire a la pagina de articulos de inventario de ese producto")
    public void irePaginaArticulosInventario() {
    }


}