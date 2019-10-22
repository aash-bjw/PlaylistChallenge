package io.zipcoder;

public class Music {

    private String[] playList;


    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int i;
        int j;
        int counterA = 0;
        int counterB = 0;
      for( i = 0; i <= startIndex; i++){
          counterA++;
      }

      for(j = i; j <= playList.length; j++){
          counterB++;
      }

        if(counterA < counterB){
            return counterA;
        } else {
            return counterB;
        }
      }


    }


//down button method
//up button method
//counter for minimum number of button presses
