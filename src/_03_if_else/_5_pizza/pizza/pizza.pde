PImage pepperoni;
PImage mushroom;
PImage olive;

void setup() {
    size(500,500);
pepperoni = loadImage("pepperoni.png");
mushroom = loadImage("mushroom.png");
olive = loadImage("olive.png");
fill(#F5DD85);
  ellipse(250,300,400,400);
  fill(#FF0900);
  ellipse(250,300,380,380);
  fill(#F7E946);
  ellipse(250,300,365,365);
}
void draw() {
  if (mousePressed){
  image(pepperoni,mouseX,mouseY);
  }
  if (mousePressed){
  image(mushroom,100,300);
  }
  if (mousePressed){
  image(olive,320,300);
  }
}
