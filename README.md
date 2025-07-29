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
## 🧪 Descripción de Ejercicios

A continuación se muestran las funciones y comportamientos de cada una de las actividades desarrolladas en la app.

---

### ✅ Ejercicio 1 - Selección de Sistema Operativo

- Se presenta un ComboBox editable con 5 sistemas operativos: Windows, macOS, Linux, Android e iOS.
- Al seleccionar un sistema, se muestra en una etiqueta el sistema elegido.
- Si no se selecciona ningún valor válido, se notifica con un mensaje.

📌 Imagen del ejercicio 1:
![Imagen de WhatsApp 2025-07-29 a las 08 34 14_de13a916](https://github.com/user-attachments/assets/35b9d6b8-6b4c-488b-9cb0-da0e0c77dc08)


---

### 🎨 Ejercicio 2 - Cambio de color de fondo

- Contiene varios botones para cambiar dinámicamente el color de fondo de la interfaz.
- Cada botón representa un color distinto.
- Al dar clic, el color del fondo se actualiza inmediatamente.

📌 Imagen del ejercicio 2:
![Imagen de WhatsApp 2025-07-29 a las 08 34 14_f26bf7af](https://github.com/user-attachments/assets/1c51f92a-937a-4752-b4d0-517ff6d782f4)


---

### 🏅 Ejercicio 3 - Selección múltiple de deportes

- Presenta una serie de checkboxes con diferentes deportes.
- El usuario puede seleccionar 0, 1, 2 o hasta 3 deportes.
- Al confirmar la selección, se muestran en una etiqueta los deportes seleccionados.

📌 Imagen del ejercicio 3:
![Imagen de WhatsApp 2025-07-29 a las 08 34 14_e2698339](https://github.com/user-attachments/assets/ff9c5520-b7ea-48bb-b419-970ad978f63d)


---

### 💳 Ejercicio 4 - Selección única de método de pago

- Se muestran tres opciones mediante radiobuttons: Efectivo, Tarjeta y Transferencia.
- Solo se puede elegir una opción a la vez.
- Al presionar "Confirmar", se muestra en una etiqueta cuál fue el método elegido.

📌 Imagen del ejercicio 4:
![Imagen de WhatsApp 2025-07-29 a las 08 34 14_b6c0e696](https://github.com/user-attachments/assets/256bdaf8-813d-47a0-8b44-95293eca2795)


---

### 🗺️ Ejercicio 5 - Selección única de estado

- Muestra una serie de radiobuttons con nombres de estados: Oaxaca, Puebla, Monterrey y Ciudad de México.
- El usuario puede seleccionar solo uno.
- Al dar clic en "Confirmar", se despliega el estado seleccionado en una etiqueta.

📌 Imagen del ejercicio 5:
![Imagen de WhatsApp 2025-07-29 a las 08 34 14_27c0fb94](https://github.com/user-attachments/assets/2f77b845-d5c1-4c9e-b38f-1291df5a3bda)


---

### 🔊 Ejercicio 6 - Control de volumen

- Incluye un slider vertical para ajustar el volumen de 0% a 100%.
- Se muestran las marcas de porcentaje con etiquetas y ticks.
- Si el volumen es 0, se muestra "Silencio"; de lo contrario, el porcentaje seleccionado.

📌 Imagen del ejercicio 6:
![Imagen de WhatsApp 2025-07-29 a las 08 48 10_7548797e](https://github.com/user-attachments/assets/39918f8b-443a-45f8-a742-86d889a5fc02)



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

