package com.azeam.rps;

public class Game {
    
    private Boolean isTrue = true;

    private String userInput;

    public void gameMode(){
        while(isTrue){
            switch(userInput){
                case "one":
                    //todo singelplayer
                    break;
                case "two":
                    //todo twoplayer
                    break;
                case "three":
                    //todo change names of the wpn's
                    break;
                default:
                    //exception user typed wrong input
                    break;
            }
        }
    }
}
