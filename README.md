# Proyecto: Creación de API REST con Spring Framework.

## Descripción:
El presente proyecto consiste en una aplicación sencilla, programada con lenguaje Java y
utilizando Spring Framework, para administrar una lista de tareas pendientes (To-Do List). Dentro de las principales
características de este proyecto, se encuentran las siguientes:
* Se pueden crear, modificar, completar o eliminar tareas.
* Se puede ver una descripción básica de la aplicación e instrucciones de uso en la ventana "acerca de".
* La persistencia de datos se realiza en un base de datos PostgreSQL en la nube (Heroku Postgres).
* La API tiene habilitadas las peticiones:
    * GET - Para obtener una lista de tareas o bien, la información individual de una tarea.
    * POST - Para guardar una nueva tarea.
    * PUT - Para modificar los datos de una tarea existente o marcarla como completada.
    * DELETE - Para eliminar de forma permanente una tarea.
* El proyecto está desplegado en la plataforma Heroku.
* El consumo de la API se realizó mediante el uso de RestTemplate de Spring Framework.

## Enlace al Proyecto Desplegado:
https://lista-tareas-api-spring.herokuapp.com/
