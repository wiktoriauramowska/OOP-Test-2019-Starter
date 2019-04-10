package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class Colour extends PApplet

{
    
    int r;
    int g;
    int b;
    int value;
    private String colour;
    
    public Colour(TableRow row)
    {
        this.r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("Value");
        colour = row.getString("Colour");
        
    }


    // public void loadColours(){
    //     Table table = loadTable("colours.csv", "header");
    //     System.out.println("test");

        
    // }



}