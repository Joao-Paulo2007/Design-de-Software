# ADR (Architecture Decision Records)

Esta pasta serve para registrar as decisões arquiteturais importantes tomadas durante o desenvolvimento do projeto — o objetivo é que qualquer pessoa consiga entender **por que** o sistema foi construído de determinada forma, sem precisar perguntar para quem decidiu.

## Quando criar um ADR

Sempre que uma decisão tiver impacto relevante e de longo prazo no projeto, por exemplo:

- Escolha de um framework, biblioteca ou banco de dados
- Definição de um padrão de arquitetura (ex: camadas, microsserviços)
- Estratégia de autenticação/autorização
- Mudanças que quebram compatibilidade com decisões anteriores

## Nomenclatura

Os arquivos seguem numeração sequencial, começando em `0001`:

```
0001-usar-spring-boot.md
0002-usar-postgresql.md
0003-autenticacao-jwt.md
```

## Template de um ADR

```md
# 000X - Título da decisão

## Contexto
Qual situação ou problema levou a essa decisão precisar ser tomada?

## Problema
O que precisava ser resolvido? Quais eram as opções consideradas?

## Decisão
O que foi decidido?

## Consequências
Quais os efeitos positivos e negativos dessa decisão? O que fica mais fácil ou mais difícil a partir dela?
```