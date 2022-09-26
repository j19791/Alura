# properiedades:
# imagem básica q vai ser utilizada
FROM openjdk:8-jdk-alpine

# criando usário e grupo
RUN addgroup -S spring && adduser -S spring -G spring

# usar o usuário spring criado anteriormente
USER spring:spring

# atribuir para a variavel JAR_FILE o nome do arquivo
ARG JAR_FILE=target/*.jar

# copia para o sistema operacional com o nome app.jar
COPY ${JAR_FILE} app.jar

# o que vai ser na linha de comando para rodar
ENTRYPOINT ["java","-Xmx512m","-Dserver.port=${PORT}","-jar","/app.jar"]






