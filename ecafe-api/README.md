# ☕ eCafe API

Backend REST API desenvolvida com **Java** e **Spring Boot** para gerenciamento de uma cafeteria.

O objetivo deste projeto é aplicar conceitos utilizados em aplicações reais, como desenvolvimento de APIs REST, arquitetura em camadas, persistência de dados, validações, tratamento global de exceções, documentação com Swagger/OpenAPI e boas práticas de desenvolvimento.

O projeto está sendo desenvolvido de forma incremental e continuará evoluindo com novas funcionalidades e integrações, simulando um sistema utilizado em ambiente de produção.

> 🚧 **Status:** Projeto em desenvolvimento ativo.

---

# 🛠️ Tecnologias

<p align="left">

<img src="https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>

<img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>

<img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge"/>

<img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white"/>

<img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>

<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>

<img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black"/>

<img src="https://img.shields.io/badge/OpenAPI-6BA539?style=for-the-badge"/>

<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white"/>

<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white"/>

</p>

---

# 🚀 Funcionalidades Implementadas

## 📂 Categorias

- ✅ Cadastrar categoria
- ✅ Listar categorias
- ✅ Buscar categoria por ID
- ✅ Atualizar categoria
- ✅ Remover categoria

---

## 📦 Produtos

- ✅ Cadastrar produto
- ✅ Listar produtos
- ✅ Buscar produto por ID
- ✅ Buscar produtos por categoria
- ✅ Atualizar produto
- ✅ Remover produto

---

## 👤 Clientes

- ✅ Cadastrar cliente
- ✅ Listar clientes
- ✅ Buscar cliente por ID
- ✅ Atualizar cliente
- ✅ Remover cliente

---

## 🔧 Recursos Gerais

- ✅ Bean Validation
- ✅ Swagger/OpenAPI
- ✅ Tratamento Global de Exceções
- ✅ Logs da aplicação
- ✅ Spring Data JPA
- ✅ Persistência com PostgreSQL

---

# 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas (Layered Architecture), promovendo separação de responsabilidades, organização do código e facilidade de manutenção.

```
Controller
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

### Camadas

- Controller
- Service
- Repository
- Entity
- DTO
- Exception
- Config
- Util

---

# 📂 Estrutura do Projeto

```
src
└── main
    ├── java
    │   └── ecafe
    │       ├── category
    │       ├── product
    │       ├── customer
    │       ├── config
    │       ├── exception
    │       └── util
    │
    └── resources
        ├── application.yml
        └── ...
```

---

# 📚 Documentação da API

Após iniciar a aplicação, a documentação estará disponível em:

```
http://localhost:8080/swagger-ui/index.html
```

---

# ⚙️ Como Executar

## Pré-requisitos

- Java 21
- Maven
- PostgreSQL
- Git

## Clonar o projeto

```bash
git clone https://github.com/adenilson-silva-dev3561/ecafe-api.git
```

## Entrar na pasta

```bash
cd ecafe-api
```

## Executar

Linux / macOS

```bash
./mvnw spring-boot:run
```

Windows

```bash
mvnw.cmd spring-boot:run
```

---

# 🗺️ Roadmap

## Concluído

- [x] CRUD de Categorias
- [x] CRUD de Produtos
- [x] CRUD de Clientes
- [x] Bean Validation
- [x] Swagger/OpenAPI
- [x] Tratamento Global de Exceções
- [x] Logs

## Próximas funcionalidades

- [ ] Carrinho de Compras
- [ ] Pedidos
- [ ] Controle de Estoque
- [ ] Pagamentos
- [ ] Emissão de NFC-e
- [ ] Impressão de Pedidos
- [ ] Upload de Imagens
- [ ] Dashboard Administrativo
- [ ] Docker
- [ ] Redis
- [ ] Keycloak
- [ ] JWT
- [ ] Testes Unitários
- [ ] Testcontainers
- [ ] CI/CD com GitHub Actions

---

# 🎯 Objetivos de Aprendizado

Este projeto foi criado para consolidar conhecimentos em:

- Arquitetura de APIs REST
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Boas práticas de desenvolvimento
- Documentação de APIs
- Tratamento de exceções
- Logs
- Segurança com Keycloak
- Docker
- Testes automatizados
- Integração Contínua (CI/CD)

---

# 👨‍💻 Autor

**Adenilson Silva**

Desenvolvedor Backend Java.

- GitHub: https://github.com/adenilson-silva-dev3561
- LinkedIn: https://www.linkedin.com/in/adenilson-silva-88702125a/