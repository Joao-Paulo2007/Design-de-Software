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
ADR-0001.md
ADR-0002.md
ADR-0003.md
```

## Template de um ADR

```md
# ADR-XXXX: [Título curto da decisão, no infinitivo ou substantivo — ex.: "Uso de mensageria assíncrona para notificações"]

## Status
[Proposto | Aceito | Substituído por ADR-XXXX | Descontinuado]

*(Toda ADR nasce como "Proposto". Só muda para "Aceito" depois de discutida com a equipe.
Nunca edite uma ADR aceita para mudar de ideia — crie uma nova ADR que a substitui,
e marque a antiga como "Substituído por ADR-XXXX". Isso preserva o histórico de decisões.)*

## Contexto
[Qual é o problema ou situação que exige esta decisão? Que restrições técnicas,
de prazo, de equipe ou de negócio estão em jogo? Escreva de forma neutra — ainda
não é hora de defender a solução, só de descrever o cenário.]

## Decisão
[O que foi decidido, em tom afirmativo e direto: "Vamos usar X para resolver Y."
Evite deixar em aberto ou em condicional — a ADR registra uma escolha feita,
não uma lista de opções.]

## Alternativas Consideradas
*(Opcional, mas recomendado)*
[Quais outras opções foram avaliadas? Por que não foram escolhidas?]

## Consequências
[O que essa decisão implica — tanto vantagens quanto desvantagens aceitas.
O que fica mais fácil? O que fica mais difícil, mais caro, ou é uma troca
consciente que a equipe decidiu aceitar?]

---
*Autor(es): [nome]*
*Data: [DD/MM/AAAA]*

```
