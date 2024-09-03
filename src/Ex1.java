public class Ex1 {
    private int k;
    private int soma;
    private int indice;
    public Ex1(){
        k = 0;
        soma = 0;
        indice = 13;
    }
    public int soma(){
        while(k < indice){
            k += 1;
            soma += k;
        }
        return soma;
    }
}
