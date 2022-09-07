PImage face;
void setup() {
 face = loadImage("face.jpg");
size(600,600);
face.resize(600,600);
background(face);
}
void draw() {
fill(mouseX,mouseY,255);
ellipse(350,300,100,100);
ellipse(220,350,100,100);
fill(0,0,0);
ellipse(350,300,50,50);
ellipse(220,350,50,50);

}
 
