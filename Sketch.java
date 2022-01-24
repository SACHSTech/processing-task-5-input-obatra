import processing.core.PApplet;

public class Sketch extends PApplet {
  public float treeHorizontal = 300;
  public float treeVertical = 200;
	
  
  public void settings() {
	// size
    size(600, 600);
  }

  
  public void setup() {
    background(250, 214, 165);
  }

  
  public void draw() {
    
    if (mousePressed && mouseY > 200)
    {
      stroke(0, 76, 255);
      fill(0, 76, 255);
      ellipse(mouseX, mouseY, 100, 100);
    }

    if(mouseY > 350)
    {
      stroke(55, 135, 39);
      fill(55, 135, 39);
      rect(mouseX, mouseY, 100, 100);
    }

    
    if(key == 'w')
    {
      stroke(0, 76, 255);
      fill(0, 76, 255);
      rect(0,0,400, 100);
      
      stroke(255, 227, 115);
      fill(255, 227, 115);
      rect(0, 0, 300, 175);
    }

    if(key == 's')
    {
      stroke(252, 156, 84);
      fill(252, 156, 84);
      rect(0, 0, 300,175);

      stroke(230, 255, 8);
      fill(230, 255, 8);
      arc(200, 135, 60, 60, -PI, 0);
      
    }

    if(key == 'd')
    {
      stroke(75, 61, 96);
      fill(75, 61, 96);
      rect(0, 0, 300, 175);
    }

    if(key == 'q')
    {
      stroke(21, 40, 82);
      fill(21, 40, 82);
      rect(0, 0, 300, 175);

      stroke(199, 212, 199);
      fill(199, 212, 199);
      arc(200, 75, 80, 80, -PI, 0);
    }

    
  }

  
  public void mouseClicked()
  {
    stroke(165,42,42);
    fill(165,42,42);
    rect(treeHorizontal, treeVertical,20,150);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(310,200,50,50);
    
    stroke(45, 201, 14);
    fill(45, 201, 14);
    ellipse(280,200,50,50);
         
  }

  public void mousePressed()
  {
    stroke(32);
    fill(32);
    ellipse(50, 150, 25, 25);

    stroke(32);
    fill(32);
    triangle(56, 150, 80, 142, 80, 158);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(45, 147, 5, 5);
  }

  public void mouseReleased()
  {
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(250, 120, 20, 20);

    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(334, 130, 20, 20);

    stroke(334, 255, 255);
    fill(334, 255, 255);
    ellipse(334, 130, 20, 20);
  }

  
}