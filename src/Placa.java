public class Placa {
    
    //Atributos da classe Placa
    private String numeroDaPlaca;
    private String iniciasDaPlaca;

    //Construtor da classe Placa
    public Placa(String numeroDaPlaca, String iniciasDaPlaca){
        this.numeroDaPlaca = numeroDaPlaca;
        this.iniciasDaPlaca = iniciasDaPlaca;
    }

    //Método que checa de qual estado é  a placa fornecida pelo usuário
    public String checarLocalidadeDaPlaca(String numeroDaPlaca, String iniciasDaPlaca){
        if (iniciasDaPlaca.compareTo("HQF") >= 0 && iniciasDaPlaca.compareTo("HTW") <= 0) {
            return "A placa " + numeroDaPlaca + " pertence ao estado de Mato Grosso do Sul.";
        } else if (iniciasDaPlaca.compareTo("JXZ") >= 0 && iniciasDaPlaca.compareTo("KAU") <= 0) {
            return "A placa " + numeroDaPlaca + " pertence ao estado de Mato Grosso.";
        } else if (iniciasDaPlaca.compareTo("MVL") >= 0 && iniciasDaPlaca.compareTo("MXG") <= 0) {
            return "A placa " + numeroDaPlaca + " pertence ao estado de Tocantins.";
        } else {
            return "A placa " + numeroDaPlaca + " não pertence a nenhum dos estados cadastrados no sistema.";
        }
    }
}