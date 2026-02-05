package edu.dio.JavaBasico;

public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Davi";
        String segundoNome = "Gomes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
        //No Java existem duas formas e concatenar. 1° Usando o +, 2° usando o comando .concat()
    }
}