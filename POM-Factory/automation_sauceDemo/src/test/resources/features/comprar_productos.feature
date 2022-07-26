#language:es


Característica: Comprar productos
  Yo como usuario de Saucedemo
  Quiero añadir todos los productos al carrito
  Para realizar una sola compra

  Antecedentes:
    Dado que el usuario ingresa a la pagina de soucelabs
      |usuario |standard_user|
      |clave|secret_sauce|


  Escenario: agregar todos los productos al carrito
    Cuando el usuario agrega todos  los productos
    Y realiza el checkout
      |nombre |jonathan|
      |apellido|vela|
      |postal|0123456|

    Entonces el usuario podra realizar la compra exitosamente


