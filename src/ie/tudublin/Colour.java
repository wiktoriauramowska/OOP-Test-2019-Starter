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
        this.g = row.getInt("g");
        this.b = row.getInt("b");
        this.value = row.getInt("Value");
        this.colour = row.getString("Colour");
        
    }

    /**
     * @return the colour
     */
    private String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }


    // public void loadColours(){
    //     Table table = loadTable("colours.csv", "header");
    //     System.out.println("test");

        
    // }



}