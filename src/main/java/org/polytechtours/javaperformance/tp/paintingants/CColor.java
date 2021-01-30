package org.polytechtours.javaperformance.tp.paintingants;

public class CColor {
	
/* Puisque l'objet Color occupe trop de mémoire
 * Nous changerons les couleurs stockées à l'aide de l'objet Color en int storage
 * Nous pouvons appeler la méthode de cette classe pour convertir un entier décimal en hexadécimal */
  public static int getRed(int Color){ 
	   return (Color>>16) &0x00FF; 
	   } 
	  
	    public static int getGreen(int Color){ 
	   return (Color>>8) &0x00FF; 
	   } 
	  
	    public static int getBlue(int Color){ 
	   return Color &0x00FF; 
	   }

}
