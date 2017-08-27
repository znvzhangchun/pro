package simpleCRUD;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Created by Will on 2017/1/11.
 */
public class JsonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();
    public static String toJson(Object o){
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
