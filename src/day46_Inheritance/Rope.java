package day46_Inheritance;

import java.util.ArrayList;
import java.util.List;
public class Rope {
public static void swing() {
System.out.print("swing ");
}
public void climb() {
System.out.println("climb ");
} public static void play() { swing();
 
 }
public static void main(String[] args) {
Rope rope = new Rope();
 rope.play();
Rope rope2 = null;
rope2.play();}
}