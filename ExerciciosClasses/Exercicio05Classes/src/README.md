Questão 5 -- Problema Resolvido pelo código


Escreva as seguintes classes:
a)Uma classe Pessoa com os atributos nome (String) e sobrenome (String), cada um com get e
set. Essa classe deve ter também o método getNomeCompleto, sem parâmetros, que retorna
a concatenação do nome e sobrenome. Deve possuir dois construtores: um sem parâmetros e
outro com os dois atributos, devendo alterá-los diretamente com os métodos set.

b)Uma subclasse de Pessoa, denominada de Funcionario, com os atributos matricula(int) e
salário(double), com seus get e set. O salário jamais deve ser negativo. Todo funcionário
recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na segunda parcela.
Assim, escreva os métodos getSalarioPrimeiraParcela que retorna os 60% do salário e
getSalarioSegundaParcela que retorna os 40% do salário.

c)Uma subclasse de Funcionario, denominada de Professor, sendo que todo professor recebe
seu salário em uma única parcela. Assim, deve-se sobrescrever os métodos
getSalarioPrimeiraParcela e getSalarioSegundaParcela, sendo que método
getSalarioPrimeiraParcela deve retornar o valor integral do salário.


d)Uma classe, denominada UsaPessoa que instancia os seguintes objetos:

pessoa1(Pessoa)
nome :Mario 
sobrenome : Lopes

pessoa2(Funcionário)
nome; Lucas
sobrenome: Mendes
salário: 2000.00


pessoa3(Professor)
nome: Rafael
sobrenome: Lira
salário: 500.00

Em seguida, execute as operações na seguinte ordem:
d.1)Exibir a saída do método getNomeCompleto para os 3 objetos.
d.2)Exibir getSalarioPrimeiraParcela e getSalarioSegundaParcela para os objetos pessoa2 e
pessoa3.