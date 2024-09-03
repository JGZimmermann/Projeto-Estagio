//Código não funcional
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    private Map<String,String> valores;
    private String jsonPath;
    public Ex3(){
        valores = new HashMap<>();
        jsonPath = "dados.json";
    }
    public String getValores() throws FileNotFoundException {
        StringBuilder jsonContent = new StringBuilder();
        try(BufferedReader bufferAux = new BufferedReader(new FileReader(jsonPath))){
            String novaLinha;
            while((novaLinha= bufferAux.readLine()) != null) {
                jsonContent.append(novaLinha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String jsonString = jsonContent.toString();
        jsonString = jsonString.substring(1, jsonString.length() - 1); // Remove [ e ]

        String[] objects = jsonString.split("\\},\\{");
        for (int i = 0; i < objects.length; i++) {
            String object = objects[i];
            object = object.replace("{", "").replace("}", "");
            if (i == 0) {
                object = object.substring(1); // Remove { do primeiro objeto
            }
            if (i == objects.length - 1) {
                object = object.substring(0, object.length() - 1);
            }
            String[] array = object.split(",");
            for(String j : array){
                String[] keyValue = j.split(":");
                String key = keyValue[0].trim().replaceAll("\"", "");
                String value = (keyValue[1].trim().replaceAll("\"", ""));
                System.out.println(key + " " + value);
                valores.put(key, value);
            }
        }
        for(String chave : valores.keySet()){
            System.out.println(chave + " " + valores.get(chave));
        }
        System.out.println(valores.size());
        return "";
    }

}
