# 📱 ProyectoTap

## 👤 Desarrollador
**Yhudiel Mendoza Sánchez**  
Rol: Desarrollador, diseñador y responsable de toda la implementación del sistema.

---

## 📌 ¿Qué hace el sistema?
**ProyectoTap** es una aplicación Android que incluye un sistema de login validado con credenciales predeterminadas y una pantalla principal con acceso a 10 ejercicios prácticos. Cada ejercicio corresponde a una actividad distinta con funcionalidad propia.

---

## ✨ Características principales

- Login con validación de usuario y contraseña.
- Visualización centrada y diseño responsivo.
- 10 actividades integradas como módulos independientes.
- Interfaz cuidada con etiquetas de error visibles para validaciones.
- Transición fluida entre actividades.

---

## 🧪 Capturas de pantalla

### 🔐 Login
_Descripción:_ Pantalla inicial con campos de entrada para correo y contraseña.  
**Credenciales válidas:** `tap2025@example.com` | `tap*2025`  


---

### 🏠 Pantalla principal con 10 ejercicios
_Descripción:_ Una vez validado el acceso, se muestra la pantalla principal con botones para acceder a cada ejercicio.  



---

### 🧮 Ejercicio 1
_Descripción:_ Simulación del ejercicio Guiado7 adaptado a Android Studio.



---

### 🧪 Ejercicio 2: Selección de sistema operativo

**Descripción:**  
Este ejercicio permite al usuario seleccionar un sistema operativo desde un `Spinner` con opciones como Windows, macOS, Linux, Android e iOS. Al hacer una selección, se muestra el nombre del sistema operativo elegido en una etiqueta. Si no se selecciona ninguno, se muestra un mensaje de advertencia indicando que no se ha hecho una selección válida.

**Aprendizaje clave:**  
- Uso de `Spinner` en Android.
- Manejo de eventos `onItemSelected`.
- Actualización dinámica de `TextView` con base en la selección.
- Validación para entradas vacías.

---

### 🧪 Ejercicio 3: Deslizador de volumen

**Descripción:**  
Se implementa un `SeekBar` vertical que simula el control de volumen. El valor actual se refleja en una etiqueta de texto. Si el volumen está en cero, se muestra el mensaje “Volumen: Silencio”, de lo contrario se indica el porcentaje seleccionado.

**Aprendizaje clave:**  
- Implementación de `SeekBar` con orientación vertical.
- Lectura de valor con `onProgressChanged`.
- Condicional para cambiar el mensaje dependiendo del valor.
- Experiencia básica de interacción con controles deslizables.

---

### 🧪 Ejercicio 4: Entrada de texto y visualización

**Descripción:**  
Este ejercicio permite al usuario ingresar un nombre en un campo de texto y al presionar un botón, el texto se muestra en una etiqueta en pantalla. Es un ejercicio simple de entrada-salida de texto.

**Aprendizaje clave:**  
- Uso de `EditText` para capturar texto.
- Interacción con `Button` mediante `onClickListener`.
- Actualización del `TextView` con el texto ingresado.
- Validación básica para evitar entradas vacías.

---

### 🧪 Ejercicio 5: Botones de incremento y decremento

**Descripción:**  
El ejercicio consiste en un contador que se puede incrementar o decrementar mediante dos botones. El valor actual se muestra en una etiqueta. Se evita que el contador baje de cero.

**Aprendizaje clave:**  
- Lógica de incremento y decremento.
- Prevención de valores negativos.
- Interacción con múltiples botones para modificar una variable.
- Actualización en tiempo real del resultado en pantalla.

---

### 🎚️ Ejercicio 6
_Descripción:_ Control de volumen con `SeekBar` mostrando mensajes según el valor. Basado en el ejercicio Guiado8.

![Imagen de WhatsApp 2025-07-29 a las 08 48 10_4e64930b](https://github.com/user-attachments/assets/bfa51913-85a0-4588-8477-be3dc77f10d3)

---

### 📋 Tablas, formularios y funcionalidades

_Descripción:_ Aquí se pueden añadir imágenes que muestren datos en tablas, formularios o funcionalidades adicionales.


---

## ⚙️ Tecnologías usadas

| Componente | Descripción |
|------------|-------------|
| Android Studio | IDE de desarrollo principal |
| Java | Lenguaje base del proyecto |
| XML | Estructura de layouts y vistas |
| Emulador API 36 | Pruebas de ejecución |
| GitHub | Control de versiones y despliegue |

---

## 📂 Estructura del proyecto

```
ProyectoTap/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/proyectotap/
│           │   ├── LoginActivity.java
│           │   ├── MainActivity.java
│           │   ├── ActivityEjercicio1.java
│           │   └── ActivityEjercicio6.java
│           └── res/
│               ├── layout/
│               │   ├── activity_login.xml
│               │   ├── activity_main.xml
│               │   ├── activity_ejercicio1.xml
│               │   └── activity_ejercicio6.xml
```

---

## 📌 Instrucciones de uso

1. Clona el repositorio o descárgalo en formato ZIP.
2. Ábrelo desde Android Studio.
3. Verifica que el proyecto esté en lenguaje Java.
4. Conéctalo a un emulador o dispositivo físico.
5. Ejecuta el proyecto (`LoginActivity` es la pantalla inicial).

