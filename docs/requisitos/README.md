# Requisitos

Esta pasta serve para registrar os requisitos do sistema, servindo de base para o que precisa ser desenvolvido e para validar se o que foi construído atende ao esperado.

## Como organizar

- **Requisitos Funcionais (RF)** → o que o sistema deve fazer (ex: "o sistema deve permitir cadastro de usuário").
- **Requisitos Não Funcionais (RNF)** → qualidades e restrições do sistema (ex: desempenho, segurança, disponibilidade).
- **Regras de Negócio (RN)** → condições e restrições específicas do domínio (ex: "um usuário não pode ter dois cadastros com o mesmo CPF").
- **Casos de Uso** → descrição de como um ator interage com o sistema para atingir um objetivo.

## Nomenclatura sugerida

```
RF001-cadastro-de-usuario.md
RNF001-tempo-de-resposta.md
RN001-cpf-unico.md
```

## Boas práticas

- Cada requisito deve ter um identificador único, para poder ser referenciado em ADRs, diagramas ou tarefas.
- Mantenha os requisitos atualizados conforme o entendimento do projeto evolui — requisito desatualizado é pior do que nenhum.