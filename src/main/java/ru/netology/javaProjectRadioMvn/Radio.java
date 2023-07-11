
package ru.netology.javaProjectRadioMvn;

public class Radio {




    private int maxStation = 10;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;




    public Radio() {
        maxStation = 10;
        this.maxStation = maxStation;
    }

    public Radio(int countStation) {

        this.maxStation = countStation - 1;
    }


    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }


    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }

        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume >  maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume <  100) {
            currentVolume = currentVolume + 1;
            return;
        }
        currentVolume = 0;

    }


    public void hushTheSound() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }


    }

}