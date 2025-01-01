# Aplicação Comercial de Vendas com Spring Boot

Este repositório contém uma aplicação backend desenvolvida com **Spring Boot** para gerenciar vendas de produtos. O foco do projeto foi praticar o desenvolvimento backend, incluindo operações CRUD para usuários, tratamentos personalizados de exceções, e o gerenciamento de relacionamentos entre entidades utilizando anotações JPA como `@OneToMany` e `@ManyToMany`.

## Propósito do Projeto

Este projeto foi desenvolvido com o objetivo de:

- Consolidar conhecimentos no uso do framework **Spring Boot**;
- Praticar a implementação de relacionamentos entre entidades com **JPA**;
- Criar e tratar exceções personalizadas;
- Explorar o uso do banco de dados **H2** para simulações locais;
- Gerenciar vendas de produtos através de uma API RESTful.

## Funcionalidades

A aplicação disponibiliza os seguintes recursos:

### Para Usuários:
- **CRUD completo**:
  - Criar usuários;
  - Listar todos os usuários;
  - Buscar usuário por ID;
  - Atualizar informações de usuários;
  - Excluir usuários.

### Para Outras Entidades:
- **Consultas**:
  - Listar todas as entidades;
  - Buscar entidade por ID.

### Tratamento de Exceções
A aplicação inclui um tratamento robusto para exceções comuns, como:
- Entidade não encontrada;
- Violação de integridade de dados;
- Outros erros customizados para atender às necessidades da aplicação.

## Estrutura do Projeto

O projeto segue uma arquitetura baseada em camadas:

1. **Controller (resources)**: Lida com as requisições HTTP e expõe os endpoints REST.
2. **Service**: Contém a lógica de negócios.
3. **Repository**: Responsável pela interação com o banco de dados.
4. **Entities**: Modelos que representam as tabelas do banco de dados e os relacionamentos entre elas.
5. **Config**: Configurações específicas do projeto, como o perfil de teste e o seeding do banco de dados.

## Banco de Dados

A aplicação utiliza o banco de dados **H2**, configurado para rodar em memória durante a execução da aplicação. Este banco de dados é ideal para testes e desenvolvimento local, dispensando a necessidade de configurações adicionais.

### Exemplo de Configuração no `application-test.properties`:
```properties
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

```

### Seed de Dados
A classe `TestConfig` popula o banco de dados automaticamente ao rodar a aplicação no perfil de teste (`test`).



## Endpoints da API

### Usuários (`/users`):
- `GET /users`: Lista todos os usuários.
- `GET /users/{id}`: Retorna um usuário pelo ID.
- `POST /users`: Cria um novo usuário.
- `PUT /users/{id}`: Atualiza os dados de um usuário.
- `DELETE /users/{id}`: Exclui um usuário pelo ID.

### Produtos (`/products`):
- `GET /products`: Lista todos os produtos.
- `GET /products/{id}`: Retorna um produto pelo ID.

### Pedidos (`/orders`):
- `GET /orders`: Lista todos os pedidos.
- `GET /orders/{id}`: Retorna um pedido pelo ID.

### Categorias (`/categories`):
- `GET /categories`: Lista todas as categorias.
- `GET /categories/{id}`: Retorna uma categoria pelo ID.

## Tratamento de Exceções

A aplicação trata exceções através das seguintes classes:

- `ResourceExceptionHandler`: Lida com exceções globais para os endpoints.
- `ResourceNotFoundException`: Exceção personalizada para recursos não encontrados.
- `DatabaseException`: Exceção para erros de integridade de banco de dados.

### Estrutura de Resposta para Erros:
```json
{
  "timestamp": "2024-12-19T10:00:00Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Entity not found",
  "path": "/users/10"
}
```

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Framework**: [Spring Boot](https://spring.io/projects/spring-boot)
- **Banco de Dados**: [H2 Database](https://www.h2database.com/)
- **Gerenciador de Dependências**: [Maven](https://maven.apache.org/)
- **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)

## Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/leo-vasi/comercial.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd comercial
   ```

3. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```

4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse o console do H2 para verificar os dados:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`

