#language:es


  Característica: Eliminar producto
    Yo como usuario de Saucedemo
    Quiero eliminar productos del carrito
    Para cancelar la compra

    Antecedentes:
      Dado que el usuario ingresa a la pagina de soucelabs
        |usuario |standard_user|
        |clave|secret_sauce|

    Escenario: Eliminar producto del carrito
    Cuando el usuario agrega un producto al carrito el producto Sauce Labs Onesie
    Entonces el usuario podra eliminar el producto del carrito