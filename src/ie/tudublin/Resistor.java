package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends UI
{
    int value;
    int ones;
    int tens;
    int hundreds;
    
    public Resistor(int value, int ones, int tens, int hundreds){
        this.value = value;
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
    }
}