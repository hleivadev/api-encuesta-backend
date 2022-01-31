# api-encuesta-backend

el proyecto necesita mysql 

la configuracion necesaria para ejecutar el back es:
#MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/encuestamanager
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

al tener la DB ejecutar backend para generar JPA en basede datos, se crearan las tablas de manera automatica

fue desarrolado en intellij IDE
