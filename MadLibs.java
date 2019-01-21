/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

import java.util.Vector;
import java.util.Scanner;

/**
 *
 * @author Balqees
 */
public class MadLibs {
    
    static  String[] missingWords;
    static String s;
    static int type;
    static Scanner read = new Scanner(System.in);
    
    static void BuildStory(){
        switch(type){
            case 1:
                missingWords = new String[7];
                missingWords[0] = "verb,present";
                missingWords[1]="thing";
                missingWords[2] = "adjective";
                missingWords[3]="number";
                missingWords[4]="place";
                missingWords[5]="place";
                missingWords[6]="adjective";
                break;
            case 2:
                missingWords = new String[14];
                missingWords[0] = "adjective";
                missingWords[1]="adjective";
                missingWords[2] = "type of bird";
                missingWords[3]="room in a house";
                missingWords[4]="verb(past tense)";
                missingWords[5]="verb";
                missingWords[6]="relative's name";
                missingWords[7]="noun";
                missingWords[8]="a liquid";
                missingWords[9]="verb ending in -ing";
                missingWords[10]="part of the body (plural)";
                missingWords[11]="plural noun";
                missingWords[12]="verb ending in -ing";
                missingWords[13]="noun";
                break;
            case 3:
                missingWords = new String[15];
                missingWords[0] = "adjective";
                missingWords[1]="adjective";
                missingWords[2] = "adjective";
                missingWords[3]="noun";
                missingWords[4]="adjective";
                missingWords[5]="adjective";
                missingWords[6]="noun";
                missingWords[7]="verb";
                missingWords[8]="verb";
                missingWords[9]="adjective";
                missingWords[10]="noun";
                missingWords[11]="verb";
                missingWords[12]="noun";
                missingWords[13]="verb";
                missingWords[14]="adjective";
                break;
                
        }
        
        
//        String s ="My father "+missingWords[0]+" a new "+missingWords[1]+", The "+missingWords[1]+" is very "+missingWords[2]+","
//            + " The "+missingWords[1]+" has "+missingWords[3]+ " "+missingWords[4]+" and a "
//                +missingWords[5]+". The "+missingWords[4]+" is very "+missingWords[6]+" too.";
        
        
    }
    
    static void promptMissingWords(){
                for(int i=0;i<missingWords.length;i++)
                    {
                        System.out.println("Enter a "+missingWords[i]);
                        missingWords[i]= read.next();
                    }
                System.out.println();
                updateStory();
                
        
        
    }
       
    static void updateStory(){
        switch(type){
            case 1:
                s ="My father "+missingWords[0]+" a new "+missingWords[1]+", The "+missingWords[1]+" is very "+missingWords[2]+","
                + " The "+missingWords[1]+" has "+missingWords[3]+ " "+missingWords[4]+"s  and a \n "
                +missingWords[5]+". The "+missingWords[4]+" is very "+missingWords[6]+" too.";
                break;
            case 2:
                s= "It was a "+missingWords[0]+", cold Novemeber day. I woke up to the "+missingWords[1]+" smell of "+missingWords[2]+" roasting in the "+missingWords[3]+
                        "\n downstairs. I "+missingWords[4]+" down the stairs to see if I could help "+missingWords[5]+" the dinner. My mom said, \"See if "+missingWords[6]
                        +"\n needs a fresh "+missingWords[7]+".\" So I carried a tray of glasses full of "+missingWords[8]+" into the "+missingWords[9]+" room. When I got there, \n"+
                        "I couldn't believe my "+missingWords[10]+"! There were "+missingWords[11]+" "+missingWords[12]+" on the "+missingWords[13]+"!";
                break;
            case 3:
                s= "I walk through the color jungle. I take out my "+missingWords[0]+" canteen. There's "+missingWords[1]+" parrot with a "+missingWords[2]+" "+missingWords[3]+
                        "\n  in his mouth right in front of me in the "+missingWords[4]+" trees! I gaze at his  "+missingWords[5]+" "+missingWords[6]
                        +"\n. A sudden sound awakes me from of my daydream! A panther \"s\" "+missingWords[7]+" in front of my head! I "+missingWords[8]+" his "+missingWords[9]+"\n breath. I remember I have a packet of "+
                        missingWords[10]+" that makes go into a deep slumber! I "+missingWords[11]+" it away in front of the "+missingWords[12]+". Yes he's eating it! \nI "+missingWords[13]+" away through the "+missingWords[14]+" jungle. I meet mt parents at the tent. \n Phew; It's been an exciting day in the jungle.";
                break;
        }
         
        
        
    }
    static void printFullStory(){
        
        System.out.println("Ready to show the full story!!!");
        System.out.println();
        System.out.println(s);
        System.out.println();
               
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("what type of stories you want to play? \n 1: Simple \n 2: funny \n 3: In the Junggle trip");
        type = read.nextInt();
        BuildStory();
        promptMissingWords();
        printFullStory();
        
    }
    
}
