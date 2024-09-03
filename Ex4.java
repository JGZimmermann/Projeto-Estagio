import java.util.ArrayList;
import java.util.HashMap;

public class Ex4 {
    private HashMap<String, Double> estados;
    private ArrayList<String> percentual;
    private double n;
    public Ex4(HashMap<String, Double> estados){
        this.estados = estados;
        percentual = new ArrayList<>();
        n = 0;
    }

    private ArrayList<String> calcula(){
        for (double i : estados.values()) {
            n += i;
        }
        for (String j : estados.keySet()) {
            String s = "";
            double k = (estados.get(j) / n) * 100;
            //String porcentagem = Double.toString(k);
            String porcentagem = String.format("%.2f",k);
            s = j + " - " + porcentagem + "%";
            percentual.add(s);
        }
        return percentual;
    }

    public String toString(){
        calcula();
        return percentual.toString();
    }
}
