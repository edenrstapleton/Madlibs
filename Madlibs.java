public class MadLibs {
  /*
  Care to play a game of MadLibs?
  */
  	public static void main(String[] args){
      String name1 = "Bill";
      String name2 = "Ted";
      String adjective1 = "anxious";
      String adjective2 = "happy";
      String adjective3 = "curious";
      String verb1 = "dancing";
      String noun1 = "cat";
      String noun2 = "New York";
      String noun3 = "skeletons";
      String noun4 = "lolipop";
      String noun5 = "lighters";
      String noun6 = "microphones";
      int number = 2095; 
      String place1 = "Pluto";
   
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
