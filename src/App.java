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

        //Saída da resposta do sistema
        System.out.println(placa1.checarLocalidadeDaPlaca(placaCompleta, iniciasDaPlaca));

    }
}
