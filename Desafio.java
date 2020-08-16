import java.util.Scanner;

public class Desafio {
    public static void main (String[] args){
        System.out.println("Digite primeiro nome: ");
        Scanner dados = new Scanner(System.in);

        String nome = dados.nextLine();
        System.out.println("Digite ultimo sobrenome: "); //sobrenome

        String sobrenome = dados.nextLine(); //  2
        String usuario = nome.charAt(0) + "_" + sobrenome; // 4 - criar o login
        boolean validarsenha = false;
        boolean usename = false;
        String senha = null; // 6


        // criação de senha

        System.out.println("Crie sua senha: ");
        System.out.println("Ela precisa conter pelo menos uma letra maiúscula, letra minúscula, número e caracter especial");
        System.out.println("E por fim, possuir 8 digitos");


        while (validarsenha == false) {

            System.out.println("Digite senha: ");
            senha = dados.nextLine();

            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
                System.out.println("Senha criada: ");
                validarsenha = true;
            } else {
                System.out.println("Senha inválida, verifique os dados");
            }
            System.out.println("Pronto para começar!!!");
            System.out.println("Preencha os dados: ");
        }


            System.out.println("Usuário: " + usuario);
            System.out.println("senha: " + senha );


            // verificação dos dados

            while (usename == false) {
                System.out.println("Digite username: ");
                String Login = dados.nextLine();
                System.out.println("Digite a senha: ");
                String password = dados.nextLine();


            if (Login.equals(usuario) && password.equals(senha)){
                System.out.println("Logado com sucesso!!!");
                    usename = true;
                }else {
                    System.out.println("Usuário inválida, tente novamente");
                }

            }



    }

}

