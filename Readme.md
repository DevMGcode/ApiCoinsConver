# 💱 Desafío Conversor de Moneda 💻

Bienvenido al **Desafío Conversor de Moneda**. Esta aplicación Java permite convertir entre diferentes monedas utilizando tasas de cambio actualizadas en tiempo real mediante una API externa. 🚀

## 🚀 Funcionalidades

- ⚡ **Tasas de Cambio en Tiempo Real:** Obtén las tasas de cambio más recientes desde una API externa.
- 🔄 **Múltiples Opciones de Conversión:** Convierte entre USD y varias monedas latinoamericanas.
- 🧑‍💻 **Interfaz Amigable:** Interactúa a través de un menú simple para realizar tus conversiones.
- 💪 **Manejo de Errores:** Respuestas claras ante fallos de API o entradas inválidas.
- 🛠️ **Diseño Modular:** Código organizado y fácil de escalar.

## 🛠️ Tecnologías Utilizadas

- ☕ **Java 11+**
- 📦 **Gson** para el manejo de JSON.
- 🌐 **HttpURLConnection** para las solicitudes HTTP.
- 🔄 **Java I/O** para el manejo de datos.

## 📝 ¿Cómo Funciona?

1. Elige la opción de conversión en el menú. 🗂️
2. La aplicación solicita las tasas de cambio actuales a la **ExchangeRate API**. 🌍
3. Ingresa el valor a convertir y la aplicación hará el cálculo por ti. 💸
4. El resultado se mostrará en la consola con dos decimales. 🧮

## 🌍 Opciones de Conversión Disponibles

1. 🇺🇸 USD (Dólar) → 🇦🇷 ARS (Peso Argentino)
2. 🇦🇷 ARS (Peso Argentino) → 🇺🇸 USD (Dólar)
3. 🇺🇸 USD (Dólar) → 🇧🇷 BRL (Real Brasileño)
4. 🇧🇷 BRL (Real Brasileño) → 🇺🇸 USD (Dólar)
5. 🇺🇸 USD (Dólar) → 🇨🇴 COP (Peso Colombiano)
6. 🇨🇴 COP (Peso Colombiano) → 🇺🇸 USD (Dólar)

## ⚙️ Instalación

Sigue estos pasos para instalar y ejecutar el proyecto localmente:

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/tuusuario/conversor-challenge.git
   
2. **ve al directorio del proyecto:**
   ```bash
   cd conversor-challenge
3. **Compila el proyecto**
   ```bash
   javac -cp .:gson-2.11.0.jar *.java
4. **Java Principal**
   ```bash
     java Principal

 📝 Nota: Asegúrate de tener Gson en tu classpath para manejar las respuestas JSON.

¡Gracias por utilizar el Desafío Conversor de Moneda! 🎉 Si te gusta este proyecto, no olvides darle una ⭐ en el repositorio.