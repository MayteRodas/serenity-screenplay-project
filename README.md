# Serenity BDD Screenplay - Proyecto de Automatización

## Descripción
Proyecto de automatización de pruebas funcionales usando Serenity BDD con el patrón Screenplay, Cucumber y JUnit 5.

## Tecnologías utilizadas
- Java 17
- Gradle 8.7
- Serenity BDD 4.1.20
- Screenplay Pattern
- Cucumber 7.15.0
- JUnit 5.10.1
- Selenium 4.21.0
- Microsoft Edge WebDriver

## Estructura del proyecto

src/test/java/com/proyecto/
├── features/          → Runner de Cucumber
├── stepdefinitions/   → Definición de pasos
└── screenplay/
    ├── tasks/         → Tareas del actor
    ├── questions/     → Preguntas del actor
    └── pages/         → Page Objects

src/test/resources/
├── features/          → Escenarios Cucumber (.feature)
└── serenity.conf      → Configuración de Serenity


## Requisitos previos
- Java 17 instalado
- Gradle 8.7
- Microsoft Edge instalado
- EdgeDriver en `C:/drivers/edge/edgedriver_win64/msedgedriver.exe`

## Cómo ejecutar las pruebas

### Ejecutar todos los tests
```cmd
gradlew.bat test
```

### Generar reporte Serenity
```cmd
gradlew.bat test aggregate
```

### Ver el reporte
Abrir en el navegador: `build/site/serenity/index.html`

## Escenarios automatizados
- ✅ Login exitoso con credenciales válidas
- ✅ Login fallido con credenciales inválidas

## Aplicación bajo prueba
[The Internet - Herokuapp](https://the-internet.herokuapp.com/login)

## Autor
Mayté Rodas
