import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  waldo.resize(1280,720);
  size(1280, 720);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      

      // If the mouse is on Waldo, print “Waldo found!”
      if(mouseX == 679 && mouseY == 349) {
        System.out.println("WALDO FOUND!");
      }
      // If Waldo is found, also use the method below to play “Woohoo”
      if(mouseX == 679 && mouseY == 349) {
        playWoohoo();
        {
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      if(mousePressed)
      {
        playDoh();
      }
      // Change the name of the sound file if you need to 
  }
      }
}
void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
