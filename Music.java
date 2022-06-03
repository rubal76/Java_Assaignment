package AssignmentForInfant;

public class Music{
    public static void main(String[] args){
        playMusic();
    }
    public static void playMusic(){
        System.out.println("Music is ON");
    }

    static void adjustTheVolume(int volume) {
        System.out.println("Volume adjusted to :" +volume );
    }
}