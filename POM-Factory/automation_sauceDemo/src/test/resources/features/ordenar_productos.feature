#language:es


Característica: Ordenar producto
  Yo como usuario de Saucedemo
  Quiero ordernar los productos de la pagina
  Para seleccionar los productos organizados por precio

Antecedentes:
  Dado que el usuario ingresa a la pagina de soucelabs
    |usuario |standard_user|
    |clave|secret_sauce|

  Escenario: Ordernar productos de mayor a menor precio
    Cuando el usuario ordena los productos de mayor a menor precio
    Entonces el usuario debe visualizar los productos en orden descendente

    