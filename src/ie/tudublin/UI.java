package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	
	ArrayList<Colour> colours= new ArrayList<Colour>();
	
	
	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row:table.rows()){
            colours.add(new Colour(row));       
		}
		print(colours);
	}

	public Color findColor(int value)
	{
		
	}

	/**
	 * @return the colours
	 */
	public ArrayList<Colour> printColours() {
		for( int i = 0; i < colours.size(); i++){
			println(colours(i));
			printArray(colours);
		}
		return colours;
		
	}

	/**
	 * @param colours the colours to set
	 */
	public void setColours(ArrayList<Colour> colours) {
		this.colours = colours;
	}



	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}

	
}
