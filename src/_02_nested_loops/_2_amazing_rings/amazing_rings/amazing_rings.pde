
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1200, 1200);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}
 int x = 250;
         int speed = 2;
         int x2 = 950;

void draw() {
        background(200, 200, 200);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
        for(int circles = 45; circles > 0; circles--) {
   
  
  
    ellipse(x,250,circles * 10, circles * 10); 
    
  //Use an if statement and modulo to alternate the color of your rings.
  
    }
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
        x = x  + speed;
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        if(x == 600) {
        speed = -speed;
        }
        /*When the rings reach the left side of the sketch, reverse the direction again */
        if(x == 250) {
          speed = -speed; 
        }
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        for(int circlesTwo =45; circlesTwo > 0; circlesTwo--) {
   
  
  
    ellipse(x2,250,circlesTwo * 10, circlesTwo * 10); 
    
  //Use an if statement and modulo to alternate the color of your rings.
  
    }
        x2 = x2 - speed;
      
        if(x >= 950){
          speed = -speed;
        }
        if(x <= 250){
          speed = -speed;
        }
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
