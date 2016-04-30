/*
Daniel Herbowy
Chaparral Star Academy
lottery v.1
Mr. Davis
2/1/2016
creates guessing part of hangman game
 */
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!this.guessedLetters.contains(letter)){ 
            
            if(this.word.contains(letter)){ //adds letter to list
                guessedLetters += letter;
            }else {
                guessedLetters += letter; //adds letter to list and adds one fault
                numberOfFaults ++;
            }
        }

    }

    public String hiddenWord() {
        String guessword="";
        if (guessedLetters.length()==0){
       
            
            for(int i=0;i<word.length();i++){ //if there are no guessed letters, fills the output with _
                guessword+="_";
            }
        }
        else {
            
            guessword="";
            
            for(int i=0;i<word.length();i++){ //repeats as many times as the word to guess
            int num1=0;    
                
                for(int x=0;x<guessedLetters.length();x++){
                    
                    if(word.charAt(i)==guessedLetters.charAt(x)){  //if the guess is correct, adds it to the correct list
                        guessword+=guessedLetters.charAt(x);
                    } else{
                    
                        if(num1==guessedLetters.length()-1) {  //adds a _ to the return if the guess is incorrect
                        guessword+="_";
                    }else {
                        num1++;
                    }
                }
            }
        }
        }
        return guessword;
    }
    
}

