# Construye Asistentes Inteligentes con Spring Boot, Claude AI y Vaadin

Este proyecto demuestra cómo integrar procesamiento de lenguaje natural (NLP) de última generación utilizando **Anthropic Claude AI** con **Spring Boot** para el backend y **Vaadin** para el frontend, logrando una solución full-stack profesional completamente desarrollada en Java.

---

## 🔹 Tecnologías principales

- **Spring Boot 3.4.5**
- **Spring AI** (Integración con Anthropic Claude)
- **Vaadin Flow 24** (Frontend moderno en Java)
- **Maven** (gestión de dependencias)
- **Java 21**

---

## 🔹 Características principales

- Integración nativa con el modelo Claude 3 de Anthropic.
- Comunicación de backend a Claude AI mediante prompts.
- Construcción de una interfaz conversacional estilo chat usando Vaadin (`MessageList`, `MessageInput`).
- Arquitectura modular, limpia y mantenible.
- Pruebas unitarias para validar la integración del servicio.

---

## 🔹 Estructura del proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com.geovannycode
│   │       ├── domain
│   │       └── web
│   └── resources/
│       └── application.yml
└── test/
    └── java/
        └── com.geovannycode
```

---

## 🔹 Configuración de la API Key

Agrega tu clave API de Anthropic en el archivo `application.yml`:

```yaml
vaadin:
  launch-browser: 'true'
spring:
  application:
    name: spring-vaadin-ia
  ai:
    anthropic:
      api-key: ${API_KEY}
      model: claude-3-sonnet-20240229
      max-tokens: 1024
      temperature: 0.7
      top-p: 0.9
      stop-sequences: ["END"]
      system: "You are an AI assistant that provides helpful responses."
      streaming: false
```

Puedes obtener tu API Key desde [https://console.anthropic.com/](https://console.anthropic.com/).

---

## 🔹 Ejecución del proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/geovannymcode/spring-vaadin-ia.git
   cd spring-vaadin-ia
   ```

2. Configura tu variable de entorno `API_KEY`.

3. Ejecuta la aplicación:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Accede a `http://localhost:8080` en tu navegador.

---

## 🔹 Capturas de pantalla

- **Vista inicial de Chat** (Formulario limpio y listo para interactuar)
- **Conversación con Claude AI** (Mensajes del usuario y respuestas del asistente)

> Las capturas completas están disponibles en el artículo asociado.

---

## 🔹 Artículo relacionado

Lee la guía completa de construcción y explicación:

👉 [https://geovannycode.com/construye-asistentes-inteligentes-con-spring-boot-claude-ai-y-vaadin/](https://geovannycode.com/construye-asistentes-inteligentes-con-spring-boot-claude-ai-y-vaadin/)

---

## 🔹 Conecta conmigo

- 📢 **Twitter/X**: [@geovannycode](https://twitter.com/geovannycode)
- 🔗 **LinkedIn**: [Geovanny Mendoza](https://www.linkedin.com/in/geovannycode/)
- 🌐 **Blog**: [www.geovannycode.com](https://www.geovannycode.com)

---

## 🔹 Licencia

Este proyecto está disponible bajo la licencia MIT. Libre de usar, modificar y compartir.
