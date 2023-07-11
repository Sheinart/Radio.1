package ru.netology.javaProjectRadioMvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testRadioVolume() {
        Radio volume = new Radio( 100);
        Assertions.assertEquals(0,volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());

    }

    @Test
    public void testRadioStation() {
    Radio station = new Radio(20);

    station.setCurrentStation(15);

    int expected = 0;
    int actual = station.getCurrentStation();
    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation() {
        Radio station = new Radio();

        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinimumBoundariesStation() {
        Radio station = new Radio();

        station.setCurrentStation(-5);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumLimitsStation() {
        Radio station = new Radio();

        station.setCurrentStation(16);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(6);

        station.next();

        int expected = 7;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testContinuationOfStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.prev();

        int expected = 8;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationReturn() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinimumSound() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-10);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumSound() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLouderSound() {
        Radio volume = new Radio();
        volume.setCurrentVolume(54);

        volume.increaseVolume();

        int expected = 55;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMuteSound() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHushTheSound() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.hushTheSound();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevSound() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.hushTheSound();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
