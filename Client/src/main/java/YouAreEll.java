import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.javafx.jmx.json.JSONException;
import jdk.nashorn.internal.ir.RuntimeNode;
import okhttp3.*;
import sun.plugin2.message.Message;

import java.io.IOException;

public class YouAreEll {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    YouAreEll() {

    }

    public static void main(String[] args) {
        YouAreEll urlhandler = new YouAreEll();
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));


//            ObjectMapper mapper = new ObjectMapper();
//            jpayload = mapper.writeValueAsString();


        }


    public String postMessage(String fromid, String toid, String message) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        Messages myMessage = new Messages(fromid, toid, message);
        String payload = mapper.writeValueAsString(myMessage);
        String url = "/ids/" + toid + "/messages";
       return  MakeURLCall(url, "POST", payload);
    }

    public String get_ids() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String MakeURLCall(String mainurl, String method, String jpayload) {
        String myUrl = "http://zipcode.rocks:8085" + mainurl;
        OkHttpClient client = new OkHttpClient();


        if (method.equals("GET")) {
            Request request = new Request.Builder().url(myUrl).build();
            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } else if (method.equals("POST")) {
            RequestBody body = RequestBody.create(JSON, jpayload);
            Request request = new Request.Builder().url(myUrl).post(body).build();

            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "nada";
    }

}
