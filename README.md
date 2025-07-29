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

![Captura Login](./a04e26cd-a2ca-417c-b9cb-739c4692ecb8.jpg)

---

### 🏠 Pantalla principal con 10 ejercicios
_Descripción:_ Una vez validado el acceso, se muestra la pantalla principal con botones para acceder a cada ejercicio.  

![Pantalla principal](./580c7281-0acf-4eb3-97df-a450f7dd9539.jpg)

---

### 🧮 Ejercicio 1
_Descripción:_ Simulación del ejercicio Guiado7 adaptado a Android Studio.

![Ejercicio 1](./8dcf47db-04ac-4e7d-80a5-c6f1ace03759.jpg)

---

### 🎚️ Ejercicio 6
_Descripción:_ Control de volumen con `SeekBar` mostrando mensajes según el valor. Basado en el ejercicio Guiado8.

![Ejercicio 6](./ac443f45-7eb6-4db1-afa2-0c68c2a9fb46.jpg)

---

### 📋 Tablas, formularios y funcionalidades

_Descripción:_ Aquí se pueden añadir imágenes que muestren datos en tablas, formularios o funcionalidades adicionales.

![Tabla 1](./d412d069-98ed-4996-802e-caf86fead51c.jpg)
![Formulario](./5b28a160-476d-4d44-8308-df8503af19ca.jpg)
![Confirmación](./73fdab8d-491b-42f6-8d09-f82d8b435a72.jpg)
![Resultado](./8ee6d5a4-a39a-4158-ad4f-721c7610f3ec.jpg)

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
