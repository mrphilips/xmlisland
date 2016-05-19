package main.test.datas.responses;

import main.java.datas.responses.EchoResponse;
import main.java.datas.responses.ExploreResponse;
import main.java.datas.responses.resources.ExploredResource;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by david on 19/05/2016.
 */
public class ExploreResponseTest {
    String s = "{ \"cost\": 5,\n" +
            "  \"extras\": {\n" +
            "    \"resources\": [\n" +
            "      { \"amount\": \"HIGH\", \"resource\": \"FUR\", \"cond\": \"FAIR\" },\n" +
            "      { \"amount\": \"LOW\", \"resource\": \"WOOD\", \"cond\": \"HARSH\" }\n" +
            "    ],\n" +
            "    \"pois\": [ \"creek-id\" ]\n" +
            "  },\n" +
            "  \"status\": \"OK\" }";
    JSONObject jsonObject;
    ExploreResponse r;

    @Test
    public void simpleTest(){
        try{
            jsonObject = new JSONObject(s);
            r = new ExploreResponse(jsonObject);
            r.getJSONDatas();

            assertEquals(5,r.getCost());
            assertEquals("OK",r.getStatus());

            ExploredResource resource1 = r.getResources()[0];
            ExploredResource resource2 = r.getResources()[1];

            String pois = r.getPois()[0];

            assertEquals("HIGH",resource1.getAmount());
            assertEquals("FUR",resource1.getResource());
            assertEquals("FAIR",resource1.getCond());

            assertEquals("LOW",resource2.getAmount());
            assertEquals("WOOD",resource2.getResource());
            assertEquals("HARSH",resource2.getCond());

            assertEquals("creek-id",pois);


        }

        catch (JSONException e){
            e.printStackTrace();
        }
    }
}
