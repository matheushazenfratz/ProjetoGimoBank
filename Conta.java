
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

import java.util.Scanner;

public class Conta{
    Scanner entrada=new Scanner(System.in);
    
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
    public double Sacar(double saldo, int numeroconta){
  
        System.out.println("Digite o valor do saque: ");
        double saque=entrada.nextDouble();
        
        if(saque<=saldo){
            saldo=-saque;
            return saldo;
        }else{
            return saldo;
        }
        
    }
    
    public doubel Depositar(double saldo){
        
        System.out.println("Digite o valor do deposito: ");
        double deposito=entrada.nextDouble(); 
        
        if(deposito>10){
            saldo += deposito;
            return saldo;
        }else{
            return saldo;
        }
    }
    
    public String imprimir(double saldo, int numeroconta, String nomecliente){
        return "Olá SR(a) "+nomecliente+"\n Conta: "+numeroconta+"\n Saldo Atual: "+saldo);
    }
    
            
}
