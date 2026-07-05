# AttendanceManager - Android Portfolio Project

[**🇪🇸 Versión en Español**](#versión-en-español) | [**🇬🇧 English Version**](#english-version)

---

## English Version

### Overview

**AttendanceManager** is a portfolio Android application demonstrating modern mobile development with Kotlin, MVVM architecture, and cloud integration. The app implements an employee attendance tracking system with real-time geolocation validation and offline-first synchronization.

### Key Features

- **User Authentication** — Firebase-based login and registration
- **Real-Time Attendance Tracking** — GPS-based check-in/check-out with geofencing
- **Geofence Validation** — Validates employee location within 500m radius of office
- **Offline-First Architecture** — Local Room Database with automatic Firestore sync
- **Admin Dashboard** — Real-time employee status and monthly attendance reports
- **Cloud Synchronization** — Automatic data sync when network becomes available

### Technology Stack

**Language & Architecture:**
- Kotlin with Coroutines
- MVVM (Model-View-ViewModel) + Clean Architecture
- Jetpack Compose (Modern UI)

**Data & Cloud:**
- Room Database (Local storage)
- Firebase Authentication
- Firebase Firestore (Cloud database)
- Firebase Cloud Messaging (Push notifications)

**Location & Mapping:**
- Google Maps API
- Google Play Services (Geofencing)

**Dependency Injection & Testing:**
- Hilt for Dependency Injection
- MockK for unit testing

### Setup & Installation

#### Prerequisites
- Android Studio Giraffe or later
- JDK 11+
- Android SDK 24+ (compileSdk 34)
- Gradle 8.0+

#### Step 1: Clone the Repository
```bash
git clone https://github.com/ryamunu/attendance-manager-demo.git
cd attendance-manager-demo
```

#### Step 2: Build & Run
```bash
./gradlew assembleDebug
./gradlew installDebug
```

Or open in Android Studio and click **Run**.

### Features Demo

#### Mock Mode (Default)
- Works out-of-the-box without API keys
- Pre-populated sample data (employees, locations)
- All features functional with simulated data

#### Real Mode (With Firebase & Maps)
- Live authentication
- Real-time database synchronization
- Live geolocation tracking
- Push notifications

### Architecture Highlights

**Offline-First Sync:**
- Attendance records saved locally to Room Database first
- Automatic sync to Firestore when network available

**MVVM Pattern:**
- Separation of concerns (Data, Domain, Presentation)
- ViewModel manages UI state
- LiveData for reactive updates

### Author

**Jhordan Lee Peralta Lozano**
- Email: lee4545p@gmail.com
- LinkedIn: [jhordan-lee-peralta-lozano](https://linkedin.com/in/jhordan-lee-peralta-lozano-b3a94b419)
- Phone: +51 917 141 261

### License

This project is provided as-is for portfolio purposes.

---

## Versión en Español

### Descripción General

**AttendanceManager** es una aplicación Android de portfolio que demuestra desarrollo móvil moderno con Kotlin, arquitectura MVVM e integración en la nube. La app implementa un sistema de registro de asistencia de empleados con validación de geolocalización en tiempo real y sincronización offline-first.

### Características Principales

- **Autenticación de Usuarios** — Login y registro basado en Firebase
- **Registro de Asistencia en Tiempo Real** — Check-in/check-out basado en GPS con geocercas
- **Validación de Geocercas** — Valida que el empleado esté dentro de 500m del oficina
- **Arquitectura Offline-First** — Base de datos local Room con sincronización automática a Firestore
- **Dashboard Admin** — Estado de empleados en tiempo real y reportes mensuales de asistencia
- **Sincronización en la Nube** — Sincronización automática de datos cuando la red está disponible

### Stack Tecnológico

**Lenguaje & Arquitectura:**
- Kotlin con Coroutines
- MVVM (Model-View-ViewModel) + Arquitectura Limpia
- Jetpack Compose (UI Moderna)

**Datos & Nube:**
- Room Database (Almacenamiento local)
- Firebase Authentication
- Firebase Firestore (Base de datos en la nube)
- Firebase Cloud Messaging (Notificaciones push)

**Ubicación & Mapas:**
- Google Maps API
- Google Play Services (Geofencing)

### Configuración e Instalación

#### Requisitos Previos
- Android Studio Giraffe o superior
- JDK 11+
- Android SDK 24+ (compileSdk 34)
- Gradle 8.0+

#### Paso 1: Clonar el Repositorio
```bash
git clone https://github.com/ryamunu/attendance-manager-demo.git
cd attendance-manager-demo
```

#### Paso 2: Compilar y Ejecutar
```bash
./gradlew assembleDebug
./gradlew installDebug
```

O abrir en Android Studio y hacer clic en **Run**.

### Autor

**Jhordan Lee Peralta Lozano**
- Email: lee4545p@gmail.com
- LinkedIn: [jhordan-lee-peralta-lozano](https://linkedin.com/in/jhordan-lee-peralta-lozano-b3a94b419)
- Teléfono: +51 917 141 261

### Licencia

Este proyecto se proporciona tal cual para propósitos de portfolio.
