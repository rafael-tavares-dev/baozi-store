# 🥟 Baozi Store API

Esta é uma API REST simples desenvolvida como atividade prática para a disciplina de **Desenvolvimento Web Back-End**. O objetivo do projeto é gerenciar o controle básico de clientes, produtos e pedidos de uma pequena loja local de pães chineses (Baozi).

---

## 🚀 Tecnologias Utilizadas

- **Java 21** (Eclipse EE)
- **Spring Boot** (Framework web)
- **Spring Data JPA** (Persistência de dados e mapeamento ORM)
- **MySQL** (Banco de Dados Relacional)
- **Postman** (Testes de endpoints)

---

## 🏛️ Arquitetura do Projeto

O projeto segue a arquitetura padrão **MVC** do Spring Boot, estruturado nos seguintes pacotes:

```text
com.baozi.store
├── controller
│   ├── ClienteController.java
│   ├── PedidoController.java
│   └── ProdutoController.java
├── model
│   ├── Cliente.java
│   ├── Pedido.java
│   └── Produto.java
├── repository
│   ├── ClienteRepository.java
│   ├── PedidoRepository.java
│   └── ProdutoRepository.java
└── StoreApplication.java
```

---

## 📝 Entidades e Especificação da API

### 1. Cliente
- `id` (Long, Chave Primária Auto-incremento)
- `nome` (String)
- `clienteDesde` (LocalDate)

### 2. Produto
- `id` (Long, Chave Primária Auto-incremento)
- `nome` (String)
- `preco` (BigDecimal)
- `estoque` (Boolean)

### 3. Pedido
- `id` (Long, Chave Primária Auto-incremento)
- `clienteId` (Long)
- `produtoId` (Long)
- `quantidade` (Integer)

---

## 🛣️ Endpoints Implementados (CRUD)


- Entidade `produto`:
  
| Método | Endpoint | Descrição | Body (JSON) |
| :--- | :--- | :--- | :--- |
| **POST** | `/produtos` | Cadastrar novo produto | `{"nome": "Baozi Pork Premium", "preco": 8.50, "estoque": true}` |
| **GET** | `/produtos` | Listar todos os produtos | — |
| **GET** | `/produtos/{id}` | Buscar produto por ID | — |
| **PUT** | `/produtos/{id}` | Atualizar produto por ID | `{"preco": 6.50}` |
| **DELETE**| `/produtos/{id}` | Deletar produto por ID | — |


- Entidade `cliente`:
  
| Método | Endpoint | Descrição | Body (JSON) |
| :--- | :--- | :--- | :--- |
| **POST** | `/clientes` | Cadastrar novo cliente | `{"nome": "Rafael Luiz Tavares 5494996", "clienteDesde": "2026-10-08"}` |
| **GET** | `/clientes` | Listar todos os clientes | — |
| **GET** | `/clientes/{id}` | Buscar cliente por ID | — |
| **PUT** | `/clientes/{id}` | Atualizar cliente por ID | `{"clienteDesde": "2026-09-08"}` |
| **DELETE**| `/clientes/{id}` | Deletar cliente por ID | — |


- Entidade `pedido`:
  
| Método | Endpoint | Descrição | Body (JSON) |
| :--- | :--- | :--- | :--- |
| **POST** | `/pedidos` | Registrar novo pedido | `{"clienteId": 1, "produtoId": 1, "quantidade": 5}` |
| **GET** | `/pedidos` | Listar todos os pedidos | — |
| **GET** | `/pedidos/{id}` | Buscar pedido por ID | — |
| **PUT** | `/pedidos/{id}` | Atualizar pedido por ID | `{"quantidade": 10}` |
| **DELETE**| `/pedidos/{id}` | Deletar pedido por ID | — |

---

## 📋 Estudo de Caso / Situação Fictícia

A **Baozi Store** é uma pequena loja especializada na venda de pão chinês. Para melhorar a organização do negócio, foi desenvolvido um sistema simples para controlar clientes, produtos e pedidos por meio de uma API REST.

Um cliente chamado **Rafael Luiz Tavares 5494996** realizou seu cadastro no sistema em **08/10/2026**.

O produto vendido pela loja chama-se **Baozi Pork Premium**, sendo comercializado pelo valor de **R$ 8,50** por unidade e encontrando-se **disponível em estoque**.

Em determinado momento, o cliente **Rafael Luiz Tavares 5494996** realizou um pedido de **5 unidades** do produto **Baozi Pork Premium**.

O sistema registra o cliente, o produto comprado e a quantidade solicitada, facilitando o controle dos pedidos realizados pela Baozi Store.


---

## 🛠️ Como Executar o Projeto Localmente

1. Clone o repositório para sua máquina:
   ```bash
   git clone https://github.com/rafael-tavares-dev/baozi-store
   ```
2. Certifique-se de que a porta `8080` está livre.
3. Configure a conexão do banco de dados no arquivo `src/main/resources/application.properties` (se necessário).
4. Execute a aplicação Spring Boot através da sua IDE de preferência ou via terminal:
   ```bash
   mvn spring-boot:run
   ```
5. A API estará disponível no endereço `http://localhost:8080`.
