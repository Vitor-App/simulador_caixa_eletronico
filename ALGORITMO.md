# Algoritmo do Simulador de Caixa Eletrônico

1. Iniciar o programa.
2. Criar a variável `saldo` com o valor zero.
3. Mostrar o menu com as opções de consultar saldo, realizar depósito, realizar saque e sair.
4. Ler a opção escolhida pelo usuário.
5. Se a opção for 1, mostrar o saldo atual.
6. Se a opção for 2, ler o valor do depósito. Se o valor for maior que zero, somar ao saldo. Caso contrário, mostrar que o valor é inválido.
7. Se a opção for 3, ler o valor do saque. Se o valor for maior que zero e não ultrapassar o saldo, diminuir o valor do saldo. Caso contrário, mostrar que o saldo é insuficiente.
8. Se a opção for 4, mostrar a mensagem de encerramento.
9. Se a opção não estiver entre 1 e 4, mostrar que a opção é inválida.
10. Repetir o menu enquanto a opção escolhida for diferente de 4.
11. Encerrar o programa.

## Estruturas utilizadas

O programa usa `Scanner` para ler os dados digitados no console, `if` e `else if` para tomar decisões e `do-while` para repetir o menu até que o usuário escolha sair.
