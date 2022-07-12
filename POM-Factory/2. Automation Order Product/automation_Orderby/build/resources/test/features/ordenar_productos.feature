#language:es


Característica: Ordenar producto
  Yo como usuario de Saucedemo
  Quiero ordernar los productos de la pagina
  Para seleccionar los productos organizados por precio


  Escenario: Ordernar productos de mayor a menor precio
    Dado que el usuario ingresa a la pagina de soucelabs
      |usuario |standard_user|
      |clave|secret_sauce|
    Cuando el usuario ordena los productos de mayor a menor precio
    Entonces el usuario debe visualizar los productos en orden descendente

    