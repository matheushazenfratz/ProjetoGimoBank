
package com.afreiria.projetogimobank;

/*
Classe conta corrente: 

Herda a classe conta, e adiciona as seguintes modificações:

Atributos:
• Limite;

Métodos:
• public boolean usandoLimite() – retorna true se o cliente estiver utilizando o limite
(saldo negativo), e false em caso contrário;
• Reimplementação do sacar, que deve considerar o limite – mesma assinatura do
método original, apenas com reimplementação;
• Mudanças no imprimir, que deve retornar também o limite da conta;
Construtor: gera dois construtores: um que recebe apenas os parâmetros necessários ao
construtor da classe conta, e outro que recebe os mesmos parâmetros mais o limite da conta.
Classe conta poupança: Herda a classe conta, e não adiciona atributos.
Métodos:
• public void calculaRendimento(porcentagemRendimento): aplica o valor de rendimento
recebido por parâmetro ao saldo da conta;
*/

public class contaCorrente {
    
    //atributos
    double limite;
    
    //Contrutor
    public contaCorrente(int numeroconta, String nomecliente, String cpf){}
    public contaCorrente(int numeroconta, String nomecliente, String cpf, double limite){
        this.limite=limite;
    }
    
    
    // Metodos
    public boolean usandoLimite(){
        
        return true;
    }
    
    public boolean Sacar(double saldo, int numeroconta, double limite){
        return true;
    }
    
    public String imprimir(double saldo, int numeroconta, String nomecliente, double limite){
        return "";
    }
    
    
}
