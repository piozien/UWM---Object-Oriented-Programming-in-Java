package interfejsy.zad15;

public interface SoundPlayer {
    abstract void playSound();
    default void stopSound(){
        System.out.println("Sound Stopped");
    }

    static String getDevceType() {
        return "Sound Device";
    }
}
