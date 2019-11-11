
package com.afreiria.projetogimobank;

/*        
Classe conta: classe abstrata

Atributos:
• Número da conta;
• Nome do cliente;
• CPF;
• Saldo;

Métodos:
• public boolean sacar(valorSacado);
• public boolean depositar(valorDepositado);
• public String imprimir();

Construtor: que receba o número da conta, nome do cliente e CPF;
Todos os atributos deverão ter get, porém o saldo, o número da conta e CPF não poderão ter
sets públicos.
*/


public class Conta{
    
    //Atributos
    int numeroconta;
    String nomecliente;
    String cpf;
    double saldo;
    
    //Contrutor
    public Conta(int numeroconta, String nomecliente, String cpf){
        
        this.numeroconta=numeroconta;
        this.nomecliente=nomecliente;
        this.cpf=cpf;
    }
    
    //Metodos
    public boolean Sacar(double saldo, int numeroconta){
        return true;
    }
    
    public boolean Depositar(){
        return true;
    }
    
    public String imprimir(double saldo, int numeroconta, String nomecliente){
        return "";
    }
    
            
}
