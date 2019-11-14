
package com.afreiria.projetogimobank;

/*        
Classe conta especial: 
Herda de conta corrente, e indica uma conta que possui um gerente
associado. Para tanto, adiciona as seguintes modificações:

Atributos:
• nome do gerente responsável;

Métodos:
• get/set do nome do gerente;
• Modificações no imprimir, para que o nome do gerente seja retornado;

Construtor: adiciona o nome do gerente aos dois construtores da classe conta corrente – ou
seja, um construtor recebe os três parâmetros necessários à classe conta, mais o nome do
gerente, e o outro construtor recebe todos esses parâmetros e ainda o limite da conta;
*/

public class contaEspecial extends contaCorrente {
    
    //Atributo
    String gerente;
    
    //Construtor
    public class construtor{
    contaEspecial Conta = new contaEspecial();
    contaEspecial.gerente = Marcos;
    
            
            }
    
    //Metodos
    public String getNomeGerente(String gerente){
        return this.gerente;
    }
    public String setNomeGerente(String gerente){
        return this.gerente;
    }
    
    public String imprimir(double saldo, int numeroconta, String nomecliente){
        return "Olá SR(a) "+nomecliente+"\n Conta: "+numeroconta+"\n Saldo Atual: "+saldo+"\n Limite: "+limite+"\n gerente: "+ gerente;
    }
   

    
    
}

