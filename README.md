# 📦 Sistema de Gestión de Inventarios

Aplicación web **full-stack** desarrollada con **React.js**, **Spring Boot** y **MySQL**, diseñada para administrar de forma eficiente los almacenes y el inventario de una empresa. Cuenta con una arquitectura robusta, control de roles y seguridad avanzada tanto en el backend como en el frontend.

## 🚀 Tecnologías utilizadas
- ⚛️ Frontend: React.js + Axios
- ☕ Backend: Spring Boot + Spring Security + JWT
- 🐬 Base de datos: MySQL (Workbench)
- 🛡️ Seguridad: JSON Web Token (JWT), control de roles, validación de rutas

## ⚙️ Funcionalidades principales

### 👤 Roles de usuario:

- **ADMIN**:
  - Registrar almacenes.
  - Asignar RESPONSABLES a almacenes.
  - Crear categorías de artículos.

- **RESPONSABLE**:
  - Gestionar únicamente el almacén que le fue asignado.
  - Registrar artículos únicamente si pertenecen a la categoría del almacén asignado.

## 🧠 Modelo de datos

La base de datos se genera automáticamente al iniciar el backend, siguiendo este esquema de relaciones:

### 🗂️ Entidades principales:

- `user` (id, nombre, correo, contraseña, rol_id)
- `rol` (id, nombre) → admin / responsable
- `category` (id, nombre)
- `storage` (id, categoria_id, responsable_id)
- `article` (id, nombre, descripción, categoria_id)
- `storage_has_articles` (storage_id, article_id) → tabla intermedia

> 📝 Incluye script `.sql` en la carpeta `/database` (opcional) y/o autogeneración vía JPA/Hibernate.

## 🔐 Seguridad

### Backend (Spring Boot):
- Implementación de **JWT (Json Web Token)** para autenticación y autorización.
- Configuración con **Spring Security**.
- Protección de endpoints por roles (principio de menor privilegio).
- Middleware para validar tokens en cada petición.
- Validaciones fuertes para impedir peticiones inválidas o maliciosas.

### Frontend (React.js):
- Interfaz amigable con autenticación basada en tokens.
- Comunicación con el backend mediante **Axios**, utilizando encabezados `Authorization: Bearer {token}`.
- Protección de rutas mediante validación de roles:
  - **Protección visible:** No se muestran enlaces si no tiene permisos.
  - **Protección invisible:** Redirección o bloqueo de navegación si intenta ingresar manualmente a una ruta no autorizada.

## 🧰 Requisitos previos

- Node.js y npm
- Java 17 o superior
- Maven
- MySQL Workbench

## 🛠️ Pasos para ejecutar el proyecto

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/tu_usuario/gestion-inventario.git
cd gestion-inventario
```

### 2️⃣ Configurar base de datos MySQL

1. Crear una base de datos llamada `inventariodb`.
2. Configurar usuario y contraseña en el archivo `backend/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventario_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

### 3️⃣ Levantar el backend (Spring Boot)

```bash
cd backend
mvn install
mvn spring-boot:run
```

### 4️⃣ Levantar el frontend (React.js)

```bash
cd frontend
npm install
npm run dev
```

## 🗂️ Estructura del proyecto

```
gestion-inventario/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/empresa/inventario/
│   │   │   └── resources/
│   │   │       └── application.properties
│   ├── pom.xml
│
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── services/
│   │   ├── views/
│   │   └── App.jsx
│   ├── package.json
│
├── database/
│   └── script.sql (opcional)
│
└── docs/
    └── diagrama-erd.png
```

## 📷 Vista previa del modelo ERD

El diagrama entidad-relación se encuentra en `docs/diagrama-erd.png`.

## ✅ Estado del proyecto

✅ Listo para clonar y ejecutar localmente  
✅ Compatible con entornos de desarrollo y pruebas  
✅ Listo para futuras mejoras (exportación de reportes, dashboard, historial de movimientos, etc.)

## ✍️ Autor

Proyecto desarrollado por: **ISRAEL FLORES REZA**  
Contacto: roberrezaflores@gmail.com


## 📄 Licencia

Este proyecto se encuentra bajo la licencia **CMMI 3 Nivel 3: Definido**. 

Este proyecto se encuentra bajo la licencia **MOPROSOFT 5 Nivel 5: Optimizado**. 
