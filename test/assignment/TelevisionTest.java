package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  TelevisionTest {


    @Test
    public void iCanTurnOnTheTelevisionTest() {
        Television lG = new Television("lG");
        assertFalse(lG.isOn());

        lG.turnOn();
        assertTrue(lG.isOn());
    }

    @Test
    public void iCanTurnOffTheTelevisionTest(){
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.turnOff();
        assertFalse(lG.isOn());
    }


    @Test
    public void iCanIncreaseTheVolumeOfTheTelevisionTest() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(1, lG.getVolume());

        lG.increaseVolume();
        assertEquals(2, lG.getVolume());
    }


    @Test
    public void iCanDecreaseTheVolumeOfTheTelevisionTest() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(1, lG.getVolume());

        for(int i = 0; i < 8; i++){
            lG.increaseVolume();
        }
        assertEquals(9, lG.getVolume());

        lG.decreaseVolume();
        lG.decreaseVolume();
        lG.decreaseVolume();

        assertEquals(6, lG.getVolume());
    }

    @Test
    public void iCantIncreaseBeyond100Test() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(1, lG.getVolume());

        for (int i = 0; i < 99; i++) {
            lG.increaseVolume();
        }
        assertEquals(100, lG.getVolume());

        lG.increaseVolume();
        assertEquals(100, lG.getVolume());
    }

    @Test
    public void iCantDecreaseBeyond1Test() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(1, lG.getVolume());

        lG.decreaseVolume();
        assertEquals(1, lG.getVolume());
    }
    @Test
    public void volumeIsOneWhenOffTest(){
        Television lG = new Television("lG");
        lG.turnOff();
        assertFalse(lG.isOn());


        assertEquals(1,lG.getVolume());
    }

    @Test
    public void volumeCantBeIncreasedWhenOffTest(){
        Television lG = new Television("lG");
        lG.turnOff();
        assertFalse(lG.isOn());

        assertEquals(1,lG.getVolume());

        for(int i = 0; i < 20; i++) {
            lG.increaseVolume();
        }
        assertEquals(1,lG.getVolume());

        lG.turnOn();
        assertTrue(lG.isOn());
        assertEquals(1, lG.getVolume());
    }

    @Test
    public void volumeIsRetainedAfterARestartTest(){
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        for(int i =0; i < 89; i++){
            lG.increaseVolume();
        }
        assertEquals(90, lG.getVolume());

        lG.turnOff();
        lG.turnOn();
        assertEquals(90, lG.getVolume());
    }

    @Test
    public void channelCanBeChangedTest() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getChannel();
        assertEquals(1, lG.getChannel());

        for(int i=0; i <9 ; i++ ){
        lG.increaseChannel();
        }
        assertEquals(10, lG.getChannel());

            lG.decreaseChannel();
            lG.decreaseChannel();
            lG.decreaseChannel();

        assertEquals(7, lG.getChannel());
    }

    @Test
    public void channelCantGoBeyond1And10Test() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getChannel();
        assertEquals(1, lG.getChannel());

        for(int i=0; i <9 ; i++ ){
            lG.increaseChannel();
        }
        assertEquals(10, lG.getChannel());
        lG.increaseChannel();
        assertEquals(10, lG.getChannel());


        for (int i = 10; i > 1; i--) {
            lG.decreaseChannel();
        }
        assertEquals(1, lG.getChannel());
        lG.decreaseChannel();
        assertEquals(1, lG.getChannel());
    }


    @Test
    public void iCanGetMyChannel() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());


        lG.setChannel(8);
        assertEquals(8, lG.getChannel());
    }
}
