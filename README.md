# Study APIR

API Java para estudo de Spring Boot.


## Instalação
- Limpar e criar pasta */target*
  ```
  mvn clean package
  ```

* Configuração do Swagger
    - https://springdoc.org/properties
  
- application properties
  ```
    server.port=9000
    spring.application.name=study-apir
    springdoc.swagger-ui.path=/
  ```
## Navegação
### Executar a API

- Executando o  **Maven**
  ``` 
  mvn spring-boot:run
  ```

### Documentação da API (Swagger)
- http://localhost:8080/swagger-ui



### Docker

>docker pull >Sistema Op< - Download imagem <br>
>docker run >Sistema Op< - Roda o sistema <br>
>docker run -it >Sistema OP< - Roda o sistema de forma interativa <br>
>exit - sai do docker
>docker rm >ID< - remove a maquina caso não esteja em execução
>docker rm -f >ID< - remove a maquina mesmo que em execução

### BD MySql

>docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -e MYSQL_USER=new_user \
    -e MYSQL_PASSWORD=my_pwd \
    -p 3306:3306 \
    mysql

### BD postgres

>docker run -d \
    --name postgres \
    --rm \
    -e POSTGRES_USER=new_user \
    -e POSTGRES_PASSWORD=my_pwd \
    -p 5432:5432 \
    postgres

<br><br>

## Referências

- https://springdoc.org/
- https://www.docker.com/
