PImage face; 
  int x = 0;
  int y = 0;
  int x1 = 0;
  int y1 = 0;
void setup() {
  face = loadImage("face.png");
  face.resize(800,500);
  size(800, 500);
  
 
}

void draw() {
   background(face);
  fill(#FFFFFF);
  ellipse(225,185,140,140);
 
  fill(#FFFFFF);
  ellipse(400,185,140,140);
  fill(#000000);
  ellipse(x+175,y,25,25);
  if(dist(225,185, mouseX, mouseY) < 70)
  {
    x = mouseX;
    y = mouseY;
     fill(#000000);
  }
  ellipse(x,y,25,25);
}
