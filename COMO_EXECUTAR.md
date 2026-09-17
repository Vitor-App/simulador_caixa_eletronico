# Como executar

## Pré-requisito

É necessário ter o Java Development Kit instalado. O projeto foi desenvolvido para Java básico e não usa bibliotecas externas.

## Compilação

Abra o terminal na pasta onde está o arquivo `Main.java` e execute:

```bash
javac Main.java
```

## Execução

Depois da compilação, execute:

```bash
java Main
```

O menu será exibido no console. Digite uma opção de 1 a 4 e pressione Enter.

## Exemplo de uso

Uma sequência possível é consultar o saldo, depositar R$ 100, realizar um saque de R$ 40, consultar o saldo novamente e sair. O saldo final será R$ 60.

## Testes realizados

O programa foi compilado com sucesso usando Java 17. Foram testados o saldo inicial zerado, depósito válido, saque válido, saque acima do saldo, valores negativos, entrada de letras no menu, entrada de texto nos valores, opção inexistente e encerramento pela opção 4.

Todos os fluxos mantiveram o programa funcionando sem encerrar de forma inesperada.
