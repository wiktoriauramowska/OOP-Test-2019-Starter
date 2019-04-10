package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	
	ArrayList<Colour> colours= new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	
	
	void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row:table.rows()){
            colours.add(new Colour(row));       
		}
		print(colours);
	}

	void loadResistors()
	{
		Table table = loadTable("resistors.csv");
		for(TableRow row:table.rows()){
			resistors.add(new Resistor(row));
		}
	}

	// public Color findColor(int value)
	// {
		
	// }

	/**
	 * @return the colours
	 */
	public ArrayList<Colour> printColours() {
		for( int i = 0; i < colours.size(); i++){
			//println(colours(i));
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
		loadColours();
		loadResistors();
		
	}
	
	public void draw()
	{	
		noFill();
		line(200, 100, 100, 100);
		line(300, 100, 400, 100);
		rect(200, 50, 100, 100);
		line(200, 270, 100, 270);
		line(300, 270, 400, 270);
		rect(200, 220, 100, 100);
		line(200, 420, 100, 420);
		line(300, 420, 400, 420);
		rect(200, 370, 100, 100);
		line(200, 570, 100, 570);
		line(300, 570, 400, 570);
		rect(200, 520, 100, 100);
		
		
			
	}

	
}
