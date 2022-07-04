#language:es


  Característica: Eliminar producto
    Yo como usuario de Saucedemo
    Quiero eliminar productos del carrito
    Para cancelar la compra


    Escenario: Eliminar producto del carrito
    Dado que el usuario se encuentra en la pagina de soucelabs
    |usuario |standard_user|
    |clave|secret_sauce|
    Cuando el usuario agrega un producto al carrito el producto Sauce Labs Onesie
    Entonces el usuario podra eliminar el producto del carrito