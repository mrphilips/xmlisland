package main.java.stats;

/**
 * Created by david on 26/05/2016.
 * Stats from collected and crafted resources
 */
public class ResourceStats {
    private String name;
    private int amount;
    private static int TOTALRESOURCES = 0;

    public ResourceStats(String name){
        this.name = name;
    }

    public void add(int amount){
        this.amount+=amount;
        TOTALRESOURCES+=amount;
    }

    public void remove(int amount){
        this.amount-=amount;
        TOTALRESOURCES-=amount;
    }

    public boolean matches(String name){
        return (this.name).equals(name);
    }

    public String getName(){return name;}
    public int getAmount(){return amount;}

    @Override
    public String toString(){
        return "["+name+"] " + amount + " units\n";
    }

    public static int getTotalResources(){
        return TOTALRESOURCES;
    }

}
