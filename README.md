# API Cursos - Evidencia
 
## Endpoints probados
- GET /api/cursos
- POST /api/cursos
 
## Resultados
- Curso válido: correcto
- Validaciones funcionando
 
## Aprendizaje
Uso de @RequestBody, @Valid, @NotNull y @NotBlank

## ¿Qué hace @RequestBody?
Convierte el texto JSON en un objeto java para que el codigo lo pueda procesar bien

## ¿Para qué sirve @Valid?
Sirve para validar que los datos recibidos cumplan con las condiciones puestas. EJ: @Notblank, @Notnull

## Diferencia entre @NotNull y @NotBlank
@NotNull: No permite que se ingrese un valor nulo. Se pueden ingresar caracteres vacios. Se puede usar en todo tipo de datos.

@NotBlank: No permite que se ingresen caracteres vacios o en blanco. Solo se puede usar en Strings.

## ¿Por qué usamos List en vez de arreglos?
Los arreglos tienen tamaño fijo, son inmutables. Un arreglo de 5 posiciones no crecera mas.

List es dinamica, puede crecer o encogerse segun los elementos que se añadan o eliminen.
