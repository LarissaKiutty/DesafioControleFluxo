# DesafioControleFluxo

Projeto criado para exercitar o módulo de Controle de Fluxo. Este projeto simula um sistema que recebe dois parâmetros via terminal e realiza operações de controle de fluxo com exceções personalizadas.

## Descrição

O sistema recebe dois números inteiros como parâmetros via terminal. Com esses números, o sistema calcula a quantidade de interações (for loop) e imprime no console os números incrementados. Se o primeiro número for maior que o segundo, uma exceção personalizada chamada `ParametrosInvalidosException` será lançada.

### Exemplo de Funcionamento

- **Entrada**: 12 e 30
  - **Saída**:
    ```
    Imprimindo o número 1
    Imprimindo o número 2
    Imprimindo o número 3
    ...
    Imprimindo o número 18
    ```

- **Entrada**: 30 e 12
  - **Saída**:
    ```
    O segundo parâmetro deve ser maior que o primeiro
    ```

## Funcionalidades

- Recebimento de dois números inteiros via terminal
- Cálculo e impressão de interações baseadas nos números recebidos
- Lançamento de exceção personalizada `ParametrosInvalidosException` quando necessário

## Estrutura do Projeto

- `Contador.java`: Classe principal que realiza a codificação do programa
- `ParametrosInvalidosException.java`: Classe que representa a exceção de negócio no sistema

<br> Feito com ❤️ durante o bootcamp do Santander 2024.
