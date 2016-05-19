package main.java.datas.responses.resources;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by david on 19/05/2016.
 */
public class ExploredResource {
    private String amount, resource, cond;

    public ExploredResource(String amount, String resource, String cond){
        this.amount=amount;
        this.resource=resource;
        this.cond=cond;
    }

    public ExploredResource(JSONObject jsonObject) throws JSONException{
        this.amount = jsonObject.getString("amount");
        this.resource = jsonObject.getString("resource");
        this.cond = jsonObject.getString("cond");
    }

    public String getAmount(){return amount;}
    public String getResource(){return resource;}
    public String getCond(){return cond;}
}
