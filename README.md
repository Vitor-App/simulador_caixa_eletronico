# Simulador de Caixa Eletrônico

Programa simples em Java que simula operações básicas de um caixa eletrônico.

## Operações disponíveis

1. Consultar saldo
2. Realizar depósito
3. Realizar saque
4. Sair

O programa começa com saldo igual a zero, permite realizar várias operações e encerra somente quando a opção 4 é escolhida.

## Regras do sistema

- Depósitos devem possuir valor maior que zero.
- Saques devem possuir valor maior que zero.
- O saque não pode deixar o saldo negativo.
- Valores de saque maiores que o saldo exibem a mensagem `Saldo insuficiente.`.
- Opções diferentes de 1 a 4 são consideradas inválidas.

## Requisitos atendidos

- Java básico com a classe `Scanner`.
- Menu interativo no console.
- Estrutura de repetição `do-while`.
- Variável de saldo iniciada com zero.
- Consulta, depósito, saque e encerramento da sessão.
- Validação de depósitos, saques e opções do menu.
