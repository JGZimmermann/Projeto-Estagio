public class Ex5 {
    private String frase;
    public Ex5(){
        frase = "";
    }
    public String inverterPalavras(String sentenca) {
        String[] palavras = sentenca.split("");
        for(int i = palavras.length - 1; i >= 0; i--){
            frase += palavras[i];
        }
        frase += " ";
        return frase.substring(0,frase.length()-1);
    }
}
