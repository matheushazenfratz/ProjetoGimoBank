
/*
Classe conta corrente: 

Herda a classe conta, e adiciona as seguintes modifica��es:

Atributos:
� Limite;

M�todos:
� public boolean usandoLimite() � retorna true se o cliente estiver utilizando o limite
(saldo negativo), e false em caso contr�rio;

� Reimplementa��o do sacar, que deve considerar o limite � mesma assinatura do
m�todo original, apenas com reimplementa��o;
� Mudan�as no imprimir, que deve retornar tamb�m o limite da conta;

Construtor: gera dois construtores: um que recebe apenas os par�metros necess�rios ao
construtor da classe conta, e outro que recebe os mesmos par�metros mais o limite da conta.

*/

import java.util.Scanner;

public class contaCorrente {
	Scanner entrada=new Scanner(System.in);
    
    //atributos
    double limite;
    
    //Contrutor
    public contaCorrente(int numeroconta, String nomecliente, String cpf){}
    public contaCorrente(int numeroconta, String nomecliente, String cpf, double limite){
        this.limite=limite;
    }
    
    
    // Metodos
    public boolean usandoLimite(double saldo){
        if(limite<saldo) {
        	return true;
        }else {
        return false;
        }
    }
    
    public double Sacar(double saldo, int numeroconta){
    	  
        System.out.println("Digite o valor do saque: ");
        double saque=entrada.nextDouble();
        
        if(saldo == limite || saldo > limite) {
        	if(saque<=saldo){
                saldo=-saque;
                return saldo;
            }else{
                return saldo;
            }
        }else {
        	System.out.println("Limite insuficiente!");
        	return limite;
        }
        
    }
    
    public String imprimir(double saldo, int numeroconta, String nomecliente){
        return "Ol� SR(a) "+nomecliente+"\n Conta: "+numeroconta+"\n Saldo Atual: "+saldo+"\n Limite: "+limite;
    }
    
    
}

