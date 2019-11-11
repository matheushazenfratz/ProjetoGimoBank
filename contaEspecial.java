
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

public class contaEspecial {
    
    //Atributo
    String gerente;
    
    //Construtor
    
    //Metodos
    public String getNomeGerente(String gerente){
        return this.gerente;
    }
    public String setNomeGerente(String gerente){
        return this.gerente;
    }
    
    public String imprimir(double saldo, int numeroconta, String nomecliente, String gerente){
        return "";
    }
}
