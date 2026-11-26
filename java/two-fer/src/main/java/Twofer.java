public class Twofer {
    private static final String TEXTO_DO_MEIO =  "you";
    
    public String mudancaDePalavra(String texto){
        return "One for " + texto + ", one for me.";
    }

    public String twofer(String name) {

        if(name == null){
            return mudancaDePalavra(TEXTO_DO_MEIO);
        }

        return mudancaDePalavra(name); 
    }
}
