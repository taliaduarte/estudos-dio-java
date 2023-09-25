public class OlaMundo {

    public static void main (String [] args) {
                    //declaradas as variaveis na class main
        String primeiroNome = "Talia";
        String segundoNome = "Duarte";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
                    //onde foram passados os parâmetros 
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);      
    }

}