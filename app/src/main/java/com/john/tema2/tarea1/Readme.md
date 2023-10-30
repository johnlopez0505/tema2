# Tarea 1 

    Hacer que al pulsar sobre cada uno de los ImageView, abra un Activity diferente.
    Mandamos capturas de pantalla.

## Clase ActividadPrincipal
La clase `ActividadPrincipal` es una actividad de Android que extiende `AppCompatActivity`. 
Esta actividad representa la pantalla principal de la aplicación y controla la navegación a 
otras actividades cuando se interactúa con elementos de la interfaz de usuario.

### Atributos
- `boton`: Un botón que se utilizará para navegar a otra activity.
- `imgView1`: Un ImageView que se utiliza para mostrar una imagen en la interfaz y navegar a otra activity.
- `imgView2`: Otro ImageView que muestra una imagen diferente en la interfaz y navega a otra activity.

### Función `onCreate`
La función `onCreate` es un método de ciclo de vida de Android que se llama cuando la actividad se
crea por primera vez. Aquí se realiza la inicialización de la actividad y se establece el contenido 
de la vista a partir del archivo de diseño XML `activity_actividad_principal.xml`. Además, se llama
a la función `initEvent` para inicializar los eventos de los elementos de la interfaz.

### Función `initEvent`
La función `initEvent` es un método personalizado que se utiliza para configurar eventos en los 
elementos de la interfaz. En este caso, se configuran eventos de clic para los siguientes elementos:

- El botón `boton`: Cuando se hace clic en este botón, se crea un intent para navegar a la 
  actividad `Actividad2`.
- `imgView1`: Cuando se hace clic en esta imagen, se crea un intent para navegar a la actividad
  `Actividad3`.
- `imgView2`: Cuando se hace clic en esta imagen, se crea un intent para navegar a la actividad
  `Actividad4`.

Cada intent se crea para iniciar una nueva actividad en la aplicación.

En resumen, la `ActividadPrincipal` es la pantalla de inicio de la aplicación y permite a los 
usuarios navegar a otras actividades al interactuar con los elementos de la interfaz. Las 
actividades a las que se navega dependen de los eventos de clic en los elementos correspondientes.
