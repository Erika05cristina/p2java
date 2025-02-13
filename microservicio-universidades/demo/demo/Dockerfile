# 1️⃣ Usar una imagen oficial de OpenJDK
FROM eclipse-temurin:17-jdk

# 2️⃣ Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# 3️⃣ Copiar el archivo JAR generado por Maven (target/demo.jar) al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# 4️⃣ Exponer el puerto en el que correrá la aplicación
EXPOSE 8080

# 5️⃣ Ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
