/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure.project;

/**
 *
 * @author 317778
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class AdventureProject {

    /**
     * @param args the command line arguments
     */
     public static String name; //Stores user's name.
    public static Scanner strIn = new Scanner(System.in); //String input variable declaration. 
    public static Scanner intIn = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException {
         
        
        System.out.println("Welcome to Earth-Saviour Ops!\n"); //Greets user.
        
        while(true){ //Loops until the user says yes, their name is correct.
        System.out.println("First, what is your name?\n"); //Asks the user for name.
        name = strIn.nextLine();
        
        System.out.println("Your name is " + name + ", is that correct?\n"); //Asks user if their name is correct.
        String nameConfirm = strIn.nextLine();
        
        if (nameConfirm.equalsIgnoreCase ("Yes") || nameConfirm.equalsIgnoreCase("Y")) {
            break; 
        }  
        
        
    }
        
        System.out.println("Well then, " + name + ". Shall we prepare for war?!\n");
        String warConfirm = strIn.nextLine();
        
        if (warConfirm.equalsIgnoreCase("Yes") || (warConfirm.equalsIgnoreCase("Y") )) {
            System.out.println("Great! Let's get you suit up!\n");
        }
        
        
        else if (warConfirm.equalsIgnoreCase("No") || (warConfirm.equalsIgnoreCase("N") )){
        System.out.println("Well too bad! You were drafted!\n");
        
        
        
        }
        theStoryPartOne();
    }
    
    public static void theStoryPartOne() throws InterruptedException { //This method contains the story.
        Random d20 = new Random();
        int min = 1;
        int max = 20;
        
    System.out.println("12 hours earlier: you were just minding your own business at your local shopping centre...\n");
    TimeUnit.SECONDS.sleep(3); //delays dialouge from printing so that the entire dialouge does not stack in the output console.
    System.out.println("...Suddenly, you hear loud explosions coming from outside the centre... You think: 'What the hell is happening?' \n");
    TimeUnit.SECONDS.sleep(3);
    System.out.println("Will you 1. go outside and check it out or 2. stay inside?");
    System.out.println("Enter either 1 or 2.\n");
    
    int goOrStay = intIn.nextInt();
    
    if (goOrStay == 1) {
        System.out.println("You go outside and see in the sky what seems to be a UFO!\n");
        TimeUnit.SECONDS.sleep(3);
    }
    
    else if (goOrStay == 2) {
        System.out.println("You decide to be a wimp...\n ...2 hours later, everyone has evacuated but you...\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("...A mysterious creature spots you and kills you.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You're dead, Game over!\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Next time leave the shopping centre...\n");
        TimeUnit.SECONDS.sleep(3);
       System.exit(0);
    }
        System.out.println("You see a strange bomb hit a building.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Maybe that's what the explosion sounds were before.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You see that people are fleeing the area.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("The military are loading people onto busses.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Before you join them, a man runs up to you, 'Hey, you're " + name + ", right?\n");
        TimeUnit.SECONDS.sleep(3);
        
        String nameConfirm = strIn.nextLine();
        
        if (nameConfirm.equalsIgnoreCase("Yes") || nameConfirm.equalsIgnoreCase("Y")) {
            System.out.println("I thought so, come with me. You are requested by the commander.\n");
            TimeUnit.SECONDS.sleep(3);
        }
        
        else if (nameConfirm.equalsIgnoreCase("No") || nameConfirm.equalsIgnoreCase("N")) {
            System.out.println("'Don't lie to me! I know who you are. Come with me, you are requested by the commander.'\n");
            TimeUnit.SECONDS.sleep(3);
        
        }
        
        System.out.println("So you follow the man. He gets into his Jeep and tells you to get in.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("5 hours later...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("'Alright, follow me!' the man says.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("So, you follow the man into an underground base.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("A few minutes later, you meet a man that seems to be the commander.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("The commander says, 'Hello, you must be " + name + ".\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("'Well then " + name + ", there is an important operation that I need you to be a part of.'\n"
                + " 'As you can see, there are aliens invading earth, so I need you and a huge group of other people to take care of the situation.'\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("'In 7 hours, you will be deployed in Paris where the aliens will initially be attacking. It is your job to make sure they do not leave Paris.'\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("'You will be needing this' The commander hands you plasma rifle.\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("7 hours later...\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You are now in Paris and the aliens have started to attack!\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("In your quadrant of the city, you are accompanied by 10 other recruitments who are just as clueless as you.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Suddenly, you see the aliens' ships.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("'It's time', one of the recruitments say.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("The ships start to land and as soon as you know it, they start to attack.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You quickly head to the barricades set up earlier.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You then procced to fire at any alien you see.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("The leader then starts to attack; he is extremely fast.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("He notices you and starts to sprint towards you.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("You have no choice but to attack.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("To attack, enter 'Attack' and a d20 die will be rolled to determine your destiny.\n");
        String attackIN = strIn.nextLine();
        
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        if (attackIN.equalsIgnoreCase("Attack")) {
        System.out.println(random_int); }
        
        if (random_int >= 15) {
            theStoryPartTwoA();
        }
        
        else {
        theStoryPartTwoB();
        }
      }
    public static void theStoryPartTwoA() throws InterruptedException {
        
        System.out.println("Congratulations! You have killed the alien leader and all the remaining aliens are retreating!\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("3 months later you are awarded the highest badge of honour.\n");
        System.out.println("Thanks for playing!!!");
        System.exit(0);
            }
    
    public static void theStoryPartTwoB() throws InterruptedException{
        
        System.out.println("Oh no, you were captured by the aliens.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("They start performing surgery on you but they know nothing about the human anatomy so you die...\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Welp... that was a great adventure, right? I'm sorry you had to die.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Game over!");
    }
}
