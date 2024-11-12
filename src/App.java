import java.util.Scanner;   

public class App {
    //Método para checar se a placa é válida segundo o padrão Mercosul (L L L N L N N)
    static boolean checarPlacaPadronizada(String placaParam){
        //String que contém o padrão a ser seguido e comparado
        String padrao = "[A-Z]{3}[0-9][A-Z][0-9]{2}";

        //Retorna 'TRUE' ou 'FALSE'
        return placaParam.matches(padrao);
    }

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Looping do sistema todo
        while(true){
            //Interface inicial do TERMINAL
            System.out.println("-Deseja consultar uma placa?");
            String resposta = scanner.nextLine().toUpperCase();

            //Checa a resposta do usuário
            if(resposta.equals("SIM")){
                //Usuário informa a placa a ser consultada
                System.out.println("-Digite a placa do carro:");
                String placaCompleta = scanner.nextLine().toUpperCase();
                
                //Looping para pegar uma placa válida segundo o padrão Mercosul
                while(true){
                    //Checar se a placa fornecida pelo usuário é válida
                    if(checarPlacaPadronizada(placaCompleta)){
                        System.out.println("--------------------------------------------");
                        break;
                    } else {
                        System.out.println("--------------------------------------------");
                        System.out.println("-A placa é inválida segundo o padão Mercosul.");
                        System.out.println("-A placa deve ter padrão L L L N° L N° N°.");
                        System.out.println("-Digite novamente a placa do carro:");
                        placaCompleta = scanner.nextLine().toUpperCase();
                    }
                }

                //Extrair apenas as 3 inicias da placa informada pelo usuário
                String iniciasDaPlaca = placaCompleta.substring(0, 3);

                //Criar um objeto "Placa"
                Placa placa1 = new Placa(placaCompleta , iniciasDaPlaca);
        
        
                //Saída da resposta do sistema
                System.out.println(placa1.checarLocalidadeDaPlaca(placaCompleta, iniciasDaPlaca));
            } else {
                System.out.println("Sistema encerrado.");
                break;
            }
        }
    }
}
