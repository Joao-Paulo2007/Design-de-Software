# Diagramas

Esta pasta serve para guardar os diagramas visuais que representam a estrutura e o funcionamento do sistema, facilitando o entendimento do projeto sem precisar ler código.

## O que pode ser armazenado aqui

- Diagrama de Classes
- Diagrama de Casos de Uso
- Diagrama de Sequência
- Diagrama de Arquitetura
- Diagrama de Banco de Dados (ER)
- Diagrama de Componentes

## Boas práticas

- Sempre que possível, mantenha também o arquivo editável (`.drawio`, `.puml`, etc.) junto com a exportação em imagem (`.png`/`.svg`), para que o diagrama possa ser atualizado depois.
- Nomeie os arquivos de forma descritiva, indicando o tipo e o escopo do diagrama, por exemplo:

```
diagrama-classes-modulo-usuarios.drawio
diagrama-classes-modulo-usuarios.png
diagrama-sequencia-login.puml
```

- Se o diagrama fizer referência a uma decisão registrada em `docs/adr/`, mencione o número do ADR relacionado.