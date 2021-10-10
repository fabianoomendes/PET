package com.mycompany.at2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome = "", telefone = "", endereco = "", bairro = "", CEP = "", CPF = "", RG = "", email = "";
        
        while(nome.isEmpty()){
            System.out.println("Digite o seu nome: ");
            nome = scan.nextLine();
            if(nome.isEmpty()){
                System.out.println("Este campo é obrigatório");
            }
        }
        
        System.out.println("Digite o seu telefone: ");        
        do{            
            telefone = scan.nextLine();
            if(!isTelefone(telefone)){
                System.out.println("Digite um telefone valido");
            }
        }while(!isTelefone(telefone));
        
        System.out.println("Digite o seu endereço: ");
        endereco = scan.nextLine();
        
        System.out.println("Qual bairro você mora?: ");
        bairro = scan.nextLine();
        
        System.out.println("Informe o seu CEP: ");
        CEP = scan.nextLine();
        
        System.out.println("Digite o seu CPF: ");
        while(CPF.isEmpty() || !Validar.isCPF(CPF)){                
            CPF = scan.nextLine();
            if(CPF.isEmpty()){
                System.out.println("Este campo é obrigatório");
                System.out.println("Digite um CPF: ");
            }else if(!Validar.isCPF(CPF) == true){
                System.out.println("CPF invalido");
                System.out.println("Digite um CPF válido: ");
            }
        }
                                
        System.out.println("Informe o seu RG: ");
        RG = scan.nextLine();
        
        while(email.isEmpty()){
            System.out.println("Informe o seu E-mail: ");
            email = scan.nextLine();
            if(email.isEmpty()){
                System.out.println("Este campo é obrigatório");
            }
        }        
        
        System.out.println("\n-------CADASTRO REALIZADO COM SUCESSO--------\n");
        
        System.out.println("Nome: "+nome);
        System.out.println("Telefone: "+telefone);
        System.out.println("Endereço: "+endereco);
        System.out.println("Bairro: "+bairro);
        System.out.println("CEP: "+CEP);
        System.out.println("CPF: "+Validar.imprimeCPF(CPF));
        System.out.println("RG: "+RG);
        System.out.println("E-mail: "+email);        
    } 
    
    static boolean isTelefone(String tel) {
        boolean result = false;
        
        tel = tel.replace(".", "").replace("(","").replace(")","").replace("-","");
        
        if(!tel.isEmpty()){
            if(tel.length() > 15 || tel.length() < 8){
                result = false;
            }else{
                result = true;
            }
        }
        
        return result;
    }
}