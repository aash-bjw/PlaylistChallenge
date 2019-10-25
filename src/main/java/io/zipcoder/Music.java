package io.zipcoder;

public class Music {

    private String[] playList;


    public Music(String[] playList){

        this.playList = playList;
   }
//
//    public Integer selection(Integer startIndex, String selection){
//        int i;
//        int j;
//        int counterA = 0;
//        int counterB = 0;
//      for( i = 0; i <= startIndex; i++){
//          counterA++;
//      }
//
//      for(j = i; j <= playList.length; j++){
//          counterB++;
//      }
//
//        if(counterA < counterB){
//            return counterA;
//        } else {
//            return counterB;
//        }
//      }

    public Integer selection(Integer startIndex, String selection) {
        int forwardsCounter = 0;
        int backwardsCounter = 0;

        for (int i = 0; i < startIndex + 1; i++) {
            forwardsCounter++;
            if (playList[i].equals(selection)) {
                break;
            }
        }
        for (int j = startIndex; j < playList.length; j++){
            backwardsCounter ++;
            if(playList[j].equals(selection)){
                break;
            }
        }
        if (forwardsCounter > backwardsCounter){
            return backwardsCounter;
        } else {
            return forwardsCounter;}
    }
}



//down button method
//up button method
//counter for minimum number of button presses
