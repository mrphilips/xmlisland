package main.java.datas.responses;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by david on 19/05/2016.
 */
public class ScoutResponse extends Response{
    private int altitude;
    private String[] resources;
    private JSONArray resourceJSON;

    public ScoutResponse(JSONObject jsonObject){
        super(jsonObject);
    }

    @Override
    public void getJSONDatas(){
        super.getJSONDatas();

        try{
            altitude = extras.getInt("altitude");
            resourceJSON = extras.getJSONArray("resources");

            resources = new String[resourceJSON.length()];

            for(int i = 0; i < resources.length;i++)
                resources[i] = resourceJSON.getString(i);
        }

        catch(JSONException e){
            e.printStackTrace();
        }
    }

    public int getAltitude(){
        return altitude;
    }

    public String[] getResources(){return resources;}
}