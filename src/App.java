import java.util.Scanner;   

public class App {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Usuário informa a placa a ser consultada
        System.out.println("Digite a placa do carro:");
        String placaCompleta = scanner.nextLine().toUpperCase();

        //Extrair apenas as 3 inicias da placa informada pelo usuário
        String iniciasDaPlaca = placaCompleta.substring(0, 3);

        //Criar um objeto "Placa"
        Placa placa1 = new Placa(placaCompleta , iniciasDaPlaca);

        //Checar se a placa fornecida pelo usuário é válida
        if(placa1.checarPlacaPadronizada()){
            System.out.println("Placa válida segundo Mercosul.");
        } else {
            System.out.println("A placa é inválida segundo o padão Mercosul.");
        }

        //Saída da resposta do sistema
        System.out.println(placa1.checarLocalidadeDaPlaca(placaCompleta, iniciasDaPlaca));

    }
}
