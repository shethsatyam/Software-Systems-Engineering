int butX, butY, buttwoX, buttwoY, butlength = 120, buttwolength = 120, butbreadth = 60, buttwobreadth = 60;
color butColor, buttwoColor, baseColor, butNewcolor, buttwoNewcolor, currentColor;
boolean butOver = false, buttwoOver = false;

GumballMachine gumballMachine = new GumballMachine(5);

void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);

  butColor = color(255);
  butNewcolor = color(209);
  buttwoColor = color(255);
  buttwoNewcolor = color(209);
  buttwoX = 15;
  buttwoY = 100;
  butX = 15;
  butY = 200;
}

void draw() 
  {
    fill(0);
    text("The Gumball Machine", 250, 60);
    PImage image = loadImage("gumball.jpg");
    image(image, (width-image.width)/2, (height-image.height)/2);
    act(mouseX, mouseY); 
    if (butOver) 
    {
      fill(butNewcolor);
    } 
    else 
    {
      fill(butColor);
    }
    stroke(0);
    rect(butX, butY, butlength, butbreadth); 
    
    if (buttwoOver)
    {
      fill(buttwoNewcolor);
    }
    else
    {
      fill(buttwoColor);
    }
    stroke(0);
    rect(buttwoX, buttwoY, buttwolength, buttwobreadth);
    textSize(15);
    fill(100);
    text("Turn Crank", 35, 240);
    textSize(15);
    fill(100);
    text("Insert Quarter", 32, 140);
}

void act(int x, int y)
{
  if ( overbuttwo(buttwoX, buttwoY, buttwolength, buttwobreadth) )
  {
    buttwoOver = true;
    butOver = false;
  } 
  else if ( overbut(butX, butY, butlength, butbreadth) )
  {
    butOver = true;
    buttwoOver = false;
  } 
  else
  {
    buttwoOver = butOver = false;
  }
}

void mousePressed()
{
  if (buttwoOver)
  {
    buttwoColor = 0;
    gumballMachine.insertQuarter();
    System.out.println(gumballMachine);
  }
  if (butOver) 
  {
    butColor = 0;
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
  }
}

boolean overbut(int xpos, int ypos, int length, int breadth)
{
  if (mouseX >= xpos && mouseX <= xpos+length && mouseY >= ypos && mouseY <= ypos+breadth) 
  {
        return true;
  }
  else 
  {
    return false;
  }
}

boolean overbuttwo(int xpos, int ypos, int length, int breadth)  
{
  if (mouseX >= xpos && mouseX <= xpos+length && mouseY >= ypos && mouseY <= ypos+breadth)
  {
    return true;
  }
  else
  {
    return false;
  }
}