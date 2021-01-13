#Autor: pnarvaezo@choucairtesting.com
@retoAuto
Feature: Administrar Viajes
  Como usuario, yo quiero automatizar la administracion de categorias y post
  @administrarCategoria
  Scenario: Administrar categorias y post
    Given que Pablo quiere realizar el reto de automatizacion
    When el crea y valida la creacion de una categoria CategoriaReto
    Then el crea y valida la creacion de un post Viaje Con Pablo con la nueva categoria CategoriaReto