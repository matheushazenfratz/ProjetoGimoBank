
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

public abstract class Conta {
	Scanner entrada=new Scanner(System.in);
    
    //Atributos
    private int numeroconta;
	private String nomecliente;
    private String cpf;
    private double saldo;
    
    //getters e setters
    public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	/*private void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}*/

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getCpf() {
		return cpf;
	}

	/*private void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

	public double getSaldo() {
		return saldo;
	}

	/*private void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
    
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
    
    public double Depositar(double saldo){
        
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
        return "Olá SR(a) "+nomecliente+"\n Conta: "+numeroconta+"\n Saldo Atual: "+saldo;
    }
	

}
