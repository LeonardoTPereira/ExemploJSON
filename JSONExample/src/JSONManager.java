import org.json.JSONException;
import org.json.JSONObject;

public class JSONManager
{
    public static void main(String[] args) throws JSONException {

        /* -------------------------------------------------------
         * TESTE 1
         * cria um JSONObject para armazenar dados de um filme
         * https://www.devmedia.com.br/trabalhando-com-json-em-java-o-pacote-org-json/25480
         * -------------------------------------------------------*/

        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();

        //preenche o objeto com os campos: titulo, ano e genero
        my_obj.put("titulo", "JSON x XML: a Batalha Final");
        my_obj.put("ano", 2012);
        my_obj.put("genero", "Ação");

        //serializa para uma string e imprime
        String json_string = my_obj.toString();
        System.out.println("objeto original -> " + json_string);
        System.out.println();

        //altera o titulo e imprime a nova configuração do objeto
        my_obj.put("titulo", "JSON x XML: o Confronto das Linguagens");
        json_string = my_obj.toString();
        System.out.println("objeto com o título modificado -> " + json_string);
        System.out.println();

        //recupera campo por campo com o método get() e imprime cada um
        String titulo = my_obj.getString("titulo");
        Integer ano = my_obj.getInt("ano");
        String genero = my_obj.getString("genero");

        System.out.println("titulo: " + titulo);
        System.out.println("ano: " + ano);
        System.out.println("genero: " + genero);
    }
}
