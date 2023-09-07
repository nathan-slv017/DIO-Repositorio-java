package nathan.primeirasemana;
public class aa {
    public static void main( String [] args){
        final String primeiroNome = "Nathan";
        final String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    };

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Retorno Do Metodo: " + primeiroNome + " ".concat(segundoNome);
    }
}
