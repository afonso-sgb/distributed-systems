# Etapa final: runtime apenas com Java
FROM eclipse-temurin:21-jdk

# Diretório de trabalho no container
WORKDIR /app

# Copia apenas o jar empacotado fora do container
COPY target/TM-1.0-jar-with-dependencies.jar app.jar

# Comando de arranque, espera os argumentos: IP e Porto
ENTRYPOINT ["java", "-jar", "app.jar"]