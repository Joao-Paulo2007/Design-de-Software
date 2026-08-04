# Nome do Projeto

## Descrição

Breve descrição do projeto: o que ele faz, para quem é e qual problema resolve.

## Tecnologias

- Java
- Spring Boot
- PostgreSQL
- Maven

## Estrutura do projeto

```
projeto/
├── src/                        # Código-fonte da aplicação
├── docs/                       # Toda a documentação do projeto
│   ├── adr/                    # Decisões de arquitetura (ADR)
│   ├── diagrams/                # Diagramas UML e de arquitetura
│   ├── api/                    # Documentação da API (endpoints, exemplos)
│   ├── database/                # Modelagem e scripts do banco de dados
│   └── requirements/             # Requisitos funcionais e não funcionais
├── pom.xml                     # Gerenciamento de dependências (Maven)
└── README.md                   # Este arquivo
```

Cada pasta dentro de `docs/` tem seu próprio `README.md` explicando o que deve ser guardado ali — veja a seção **Documentação** abaixo.

## Como executar

1. Clone o repositório: `git clone <url-do-repositorio>`
2. Configure o banco de dados PostgreSQL (ver `docs/database/`)
3. Ajuste as variáveis de ambiente / `application.properties`
4. Rode com Maven: `mvn spring-boot:run`
5. Acesse em `http://localhost:8080`

## Documentação

Toda a documentação do projeto está organizada dentro da pasta [`docs/`](docs/README.md), separada por assunto (arquitetura, diagramas, API, banco de dados e requisitos).

## Colaboradores

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Sidney-Emanuel-Oliveira">
        <img src="https://github.com/Sidney-Emanuel-Oliveira.png" width="80px;" alt="Sidney Emanuel"/><br/>
        <sub><b>Sidney Emanuel</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/GilvanPedro">
        <img src="https://github.com/GilvanPedro.png" width="80px;" alt="Nome"/><br/>
        <sub><b>Gilvan Pedro</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/PedroDaMataSantos">
        <img src="https://github.com/PedroDaMataSantos.png" width="80px;" alt="Nome"/><br/>
        <sub><b>PedroDaMataSantos</b></sub>
      </a>
    </td>
     <td align="center">
      <a href="https://github.com/Joao-Paulo2007">
        <img src="https://github.com/Joao-Paulo2007.png" width="80px;" alt="Nome"/><br/>
        <sub><b>João Paulo</b></sub>
      </a>
    </td>
      </td>
     <td align="center">
      <a href="https://github.com/Scarcela13">
        <img src="https://github.com/Scarcela13.png" width="80px;" alt="Nome"/><br/>
        <sub><b>Guilherme Scarcela</b></sub>
      </a>
