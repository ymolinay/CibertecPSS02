Feature: Navegando a traves de la pagina del carrito

  Background: Usando la pagina del carrito
    Given Estoy en la pagina del carrito

  Scenario: Haciendo clic en el titulo del producto
    When Hago clic en el titulo del producto
    Then Ire a la pagina de articulos de inventario de ese producto

  Scenario: Clicking on 'continue shopping' in cart page
    When Hago clic en 'continue shopping' en la pagina del carrito
    Then Volvere a la pagina de inventario

  Scenario: Al hacer clic en 'Checkout' en la pagina del carrito
    When Hago clic en 'Checkout' en la pagina del carrito
    Then Ire a la pagina 'checkout step one'

  Scenario: Se muestra un articulo en el carrito y tengo opcion de eliminarlo
    When Un articulo se muestra dentro del carrito
    Then Tendre una opcion para eliminar ese articulo del carrito

  Scenario: Se muestra precio de articulo en el carrito
    When Un articulo se muestra en la pagina del carrito
    Then Vere el precio del producto
