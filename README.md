# Proyecto-Android

🧾 Nombre del proyecto: ProyectoTap
👤 Desarrollador único:
Yhudiel Mendoza Sánchez – Desarrollador, diseñador e implementador completo del sistema

📌 ¿Qué hace el sistema?
Aplicación móvil de aprendizaje para Android, que inicia con un login validado y da acceso a una pantalla principal con 10 ejercicios prácticos de programación visual adaptados desde Java Swing a Android Studio. Incluye validaciones, diseño centrado, y se mantiene en orientación vertical (sin rotación de pantalla).

📱 Tipo de sistema
Aplicación móvil Android, desarrollada con Java, utilizando Android Studio y diseño XML visual con validaciones dinámicas.

✨ Funcionalidades clave
🔐 Login con validación
El login solicita correo y contraseña.

Muestra errores en etiquetas específicas debajo de los campos.

Sólo se puede ingresar si los datos son:

📧 tap2025@example.com

🔑 tap*2025

Si las credenciales son correctas, redirige a la pantalla con 10 botones para acceder a ejercicios.

📚 Ejercicios prácticos
Cada botón dirige a un ejercicio diferente con funcionalidades adaptadas de Java Swing a Android, como:

Listas de selección.

Sliders (volumen).

Combobox simulados.

Validaciones dinámicas.

Layouts responsivos y centrados.

📲 Diseño centrado y orientado
Cada pantalla está centrada visualmente, optimizada para móviles.

Bloqueada en orientación vertical (portrait).

📁 Estructura del proyecto
swift
Copiar
Editar
📦 ProyectoTap
 ┣ 📂 app/src/main/java/com/example/proyectotap
 ┃ ┣ 📄 LoginActivity.java
 ┃ ┣ 📄 MainActivity.java
 ┃ ┣ 📄 ActivityEjercicio1.java
 ┃ ┣ 📄 ActivityEjercicio2.java
 ┃ ┗ 📄 ... (hasta el 10)
 ┣ 📂 res/layout
 ┃ ┣ 📄 activity_login.xml
 ┃ ┣ 📄 activity_main.xml
 ┃ ┗ 📄 activity_ejercicioX.xml
🧰 Tecnologías y herramientas usadas
Android Studio Flamingo | Hedgehog

Java (no Kotlin)

Gradle para gestión del proyecto

Emulador API 33/34/36 para pruebas

Diseño XML con ConstraintLayout, LinearLayout y ScrollView

🛠️ Cómo ejecutar
Clona o descarga este repositorio.

Abre el proyecto en Android Studio.

Conecta un dispositivo o ejecuta un emulador.

Ejecuta el proyecto desde LoginActivity.

Ingresa las credenciales válidas para acceder a los ejercicios.

💻 Requisitos mínimos
Recurso	Versión / Recomendación
Android Studio	Hedgehog o superior
Lenguaje	Java 8+
Dispositivo Android	API 30+
RAM mínima	2 GB
Resolución recomendada	1080x1920

