int x = 0;
int y = 0;
PImage donkey;
PImage tail;
void setup() {
  size(600,500);
  donkey = loadImage("donkey.jpg");
  donkey.resize(600,500);//change the file name if you need to
tail = loadImage("tail.png");
tail.resize(100,100);//change the file name if you need to
}

void draw() {
  background(#FAFAFA);
  image(tail, x, y);
  rect(0, 0, 30, 30);

  if(dist(0, 0, mouseX, mouseY) < 30) {
    background(donkey);
    rect(515, 150, 40, 40);
  }
  if(mousePressed) {
  println("x: " + mouseX);
  println("y: " + mouseY);
  
  if(dist(533, 171, mouseX, mouseY) < 30)
    {
      
      x = mouseX;
      y = mouseY;
    image(tail, mouseX, mouseY);
    import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}

    }
  }

}
