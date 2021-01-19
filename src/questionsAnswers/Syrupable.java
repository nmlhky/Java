package questionsAnswers;

 interface Syrupable {
 void getSugary();
 }
 abstract class Pancake implements Syrupable { }

 class BlueBerryPancake implements Syrupable {
     public void getSugary() { ; }
}
class SourdoughBlueBerryPancake extends BlueBerryPancake {
     ///*/*void getSugary(int s) { ; }*/*/
}