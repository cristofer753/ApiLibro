# ApiLibro
Web API de Libro
## Descripción de Anotaciones en Spring
![image](https://github.com/cristofer753/biblioteca/assets/141539505/756cf5bf-2f4d-4e6b-8247-fa8ba1d01d95)


- `@RequestMapping("/libros")`: Se utiliza para asignar una URL específica a un controlador o a un método de un controlador en una aplicación web.

- `@GetMapping`: Se utiliza para manejar las solicitudes HTTP GET. En el contexto de tu aplicación, puedes utilizar `@GetMapping` para llamar los libros, es decir, para recuperar una lista de libros.

![image](https://github.com/cristofer753/biblioteca/assets/141539505/6bccb932-3f0f-4e76-95ff-21d72714331a)


- `@GetMapping("/{id_libro}")`: Se utiliza para buscar un libro por su ID. Con esta anotación, puedes definir un método en tu controlador que maneje las solicitudes para buscar un libro específico por su ID.

![image](https://github.com/cristofer753/biblioteca/assets/141539505/8826395a-a568-42d4-88a0-e1764d3d0ab8)


- `@PostMapping`: Se utiliza para manejar las solicitudes HTTP POST. Puedes utilizar `@PostMapping` para agregar un libro a tu aplicación. Es común utilizar herramientas como Thunder Client para enviar solicitudes POST y agregar un nuevo libro a tu sistema.

![image](https://github.com/cristofer753/biblioteca/assets/141539505/b85252d9-3b6d-4045-b549-9492af41dcf7)


- `@GetMapping`: Después de agregar un libro, puedes utilizar `@GetMapping` para visualizar el libro ingresado. Esto te permite recuperar y mostrar los detalles del libro recién agregado.

![image](https://github.com/cristofer753/biblioteca/assets/141539505/4da499a4-ecec-4297-8823-86eebfcea61f)

