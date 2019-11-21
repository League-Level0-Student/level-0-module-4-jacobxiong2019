PImage minecraft;
PImage creeper;    
int x = (int)random(0,800);
int y = (int)random(0,500);
int x1 = mouseX;
int y1 = mouseY;
void setup() {
  creeper=loadImage("creeper.png");
  creeper.resize(5,5);
  size(800,500);
  minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(800, 500);          //in setup method
background(minecraft);          //in setup method
}

void draw() {
  background(minecraft); 
  fill(#DB0F0F);
  ellipse(mouseX,mouseY,10,10);
  println("x:" + mouseX);
  println("y:" + mouseY);
  image(creeper, x, y);
  if(dist(x, y, mouseX, mouseY) < 10) {
    fill(#44EA39);
  }
  ellipse(mouseX,mouseY,10,10);
  }
  
