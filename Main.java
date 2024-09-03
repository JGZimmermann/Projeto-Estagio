import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        //System.out.println(ex1.soma());
        Ex2 ex2 = new Ex2(34);//retorna true caso ele contenha na sequencia e false caso não
        //System.out.println(ex2.pertence());


        HashMap<String, Double> estados = new HashMap<>();
        estados.put("SP", 67836.43);
        estados.put("RJ", 36678.66);
        estados.put("MG", 29229.88);
        estados.put("PR", 27165.48);
        Ex4 ex4 = new Ex4(estados);
        //System.out.println(ex4.toString());
        Ex5 ex5 = new Ex5();
        //System.out.println(ex5.inverterPalavras("socorram me subi no onibus em marrocos"));
    }
}