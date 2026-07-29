# ☕ eCafe API

</p>

<h1 align="center">
☕ eCafe API
</h1>

<p align="center">

Backend REST API desenvolvida com <strong>Java</strong> e <strong>Spring Boot</strong> para gerenciamento de uma cafeteria.

---

<img src="https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white"/>

<img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=springboot&logoColor=white"/>

<img src="https://img.shields.io/badge/PostgreSQL-16-4169E1?logo=postgresql&logoColor=white"/>

<img src="https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white"/>

</p>

---

# 💡 Sobre o Projeto

O **eCafe API** é um projeto pessoal desenvolvido para simular o backend de uma cafeteria.

Seu principal objetivo é consolidar conhecimentos em desenvolvimento backend utilizando Java e Spring Boot, aplicando conceitos utilizados em aplicações reais, como:

- Arquitetura em Camadas
- APIs REST
- Persistência de Dados
- Bean Validation
- Tratamento Global de Exceções
- Logs Estruturados
- Documentação com Swagger/OpenAPI
- Versionamento com Git

O projeto continua evoluindo continuamente com novas funcionalidades, buscando se aproximar cada vez mais de um sistema utilizado em ambiente de produção.

---

# 🚀 Tecnologias

<p align="center">

<img src="https://skillicons.dev/icons?i=java,spring,postgres,maven,git,github,idea,docker,postman"/>

</p>

### Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate

### Banco de Dados

- PostgreSQL

### Documentação

- Swagger
- OpenAPI

### Ferramentas

- IntelliJ IDEA
- Maven
- Git
- GitHub
- Postman

### Em aprendizado

- Docker
- Keycloak
- Redis
- Testcontainers
- JUnit 5
- Mockito

---

# ✅ Funcionalidades Implementadas

## 📂 Categorias

- Cadastro de Categoria
- Listagem de Categorias
- Busca por ID
- Atualização
- Exclusão

---

## 📦 Produtos

- Cadastro de Produto
- Listagem
- Busca por ID
- Busca por Categoria
- Atualização
- Exclusão

---

## 👤 Clientes

- Cadastro de Cliente
- Listagem
- Busca por ID
- Atualização
- Exclusão

---

## 🔧 Recursos Gerais

- Bean Validation
- Tratamento Global de Exceções
- Logs Estruturados
- Swagger/OpenAPI
- Spring Data JPA
- Persistência com PostgreSQL

---

# 🏗 Arquitetura

O projeto segue o padrão **Layered Architecture**, promovendo organização, reutilização e separação de responsabilidades.

```
Cliente

    │

    ▼

REST Controller

    │

    ▼

Service

    │

    ▼

Repository

    │

    ▼

PostgreSQL
```

---

## Organização das Camadas

- Controller
- Service
- Repository
- Entity
- DTO
- Exception
- Config
- Constants

---

# 📂 Estrutura do Projeto


```text
src
└── main
    ├── java
    │   └── eCafe.API
    │       ├── category
    │       ├── common
    │       ├── config
    │       ├── customers
    │       ├── docs
    │       ├── monitoring
    │       ├── product
    │       ├── security
    │       └── EcafeApiApplication.java
    └── resources
        ├── application.yml
        └── ...
```
---

# 📚 Documentação da API

Após iniciar a aplicação, acesse:

```
http://localhost:8080/swagger-ui/index.html
```

---

# ⚙️ Como executar

## Pré-requisitos

- Java 21
- Maven
- PostgreSQL
- Git

### Clonar o projeto

```bash
git clone https://github.com/adenilson-silva-dev3561/ecafe-api.git
```

### Entrar na pasta

```bash
cd ecafe-api
```

### Executar

Linux

```bash
./mvnw spring-boot:run
```

Windows

```bash
mvnw.cmd spring-boot:run
```

---

# 🗺 Roadmap

## Concluído

- [x] CRUD de Categorias
- [x] Bean Validation
- [x] Logs
- [x] Swagger

---

## ✅ Fase 2 — Produto

- [x] CRUD de Produtos
- [x] Busca por Categoria
- [x] Relacionamento Produto x Categoria
- [x] Swagger

---

## ✅ Fase 3 — Cliente

- [x] CRUD de Clientes
- [x] Validação de CPF
- [x] Validação de E-mail
- [x] Logs
- [x] Swagger

---

## 🚧 Fase 4 — Carrinho

- [ ] Criar Carrinho
- [ ] Adicionar Produto
- [ ] Atualizar Quantidade
- [ ] Remover Produto

---

## 🚧 Fase 5 — Pedidos

- [ ] Criar Pedido
- [ ] Histórico de Pedidos
- [ ] Status do Pedido

---

## 🚧 Fase 6 — Estoque

- [ ] Controle de Estoque
- [ ] Atualização Automática

---

## 🚧 Fase 7 — Pagamentos

- [ ] PIX
- [ ] Cartão
- [ ] Mercado Pago

---

## 🚧 Fase 8 — NFC-e

- [ ] Emissão de Nota Fiscal
- [ ] XML
- [ ] PDF

---

## 🚧 Fase 9 — Dashboard

- [ ] Relatórios
- [ ] Produtos mais vendidos
- [ ] Indicadores

---

## 🚧 Fase 10 — Segurança

- [ ] JWT
- [ ] Keycloak
- [ ] Controle de Permissões

---

## 🚧 Infraestrutura

- [ ] Docker
- [ ] Docker Compose
- [ ] Redis
- [ ] JUnit 5
- [ ] Mockito
- [ ] Testcontainers
- [ ] GitHub Actions (CI/CD)

---

# 🎯 Objetivos

Este projeto foi criado para consolidar conhecimentos em:

- Desenvolvimento Backend
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- APIs REST
- Arquitetura em Camadas
- Código Limpo
- Swagger/OpenAPI
- Docker
- Keycloak
- Testes Automatizados
- CI/CD

---

# 👨‍💻 Autor

## Adenilson Silva

Desenvolvedor Backend Java.

📧 Email

**adenilson.silva.dev.3561@gmail.com**

💼 LinkedIn

https://www.linkedin.com/in/adenilson-silva-88702125a/

💻 GitHub

https://github.com/adenilson-silva-dev3561

---

<p align="center">

⭐ Se este projeto foi útil para você, deixe uma estrela no repositório.

</p>