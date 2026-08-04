# API

Esta pasta serve para documentar a API do projeto, servindo como referência para quem vai consumi-la (frontend, outros times, integrações externas).

## O que pode ser encontrado aqui

- Especificação OpenAPI / Swagger (`openapi.yaml` ou `swagger.json`)
- Exemplos de requisições (payloads de entrada)
- Exemplos de respostas (payloads de saída, incluindo erros)
- Lista de endpoints disponíveis
- Métodos HTTP aceitos por endpoint

## Sugestão de organização

```
api/
├── openapi.yaml            # Especificação completa da API
├── exemplos/
│   ├── requisicoes/
│   └── respostas/
└── endpoints.md             # Lista resumida de endpoints (rota, método, descrição)
```

## Boas práticas

- Mantenha a documentação atualizada a cada novo endpoint criado ou alterado.
- Prefira gerar a especificação OpenAPI a partir do código (quando possível) para evitar divergência entre documentação e implementação real.