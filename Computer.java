package AssignmentForInfant;

import java.util.Scanner;

public class Computer {
    public static void turnOnComputer() {
        System.out.println("Computer is Turned ON.");
    }

    public static void turnOffComputer() {
        System.out.println("Computer is TURNING OFF.");
    }

    public static void cleanCache() {
        System.out.println("cache Cleaned!");
    }
    static void reduceBrightness(int bright)
    {
        System.out.println("Brightness reduced by " + bright + "%");
    }
    public static void playMusic(){
        System.out.println("Music is ON");
    }

    public static void adjustTheVolume(int volume) {
        System.out.println("Volume adjusted to :" +volume );
    }

    public static void main(String[] args) {
        turnOnComputer();
        turnOffComputer();
        cleanCache();
        reduceBrightness(50);
        playMusic();
        adjustTheVolume(5);
        ChromeBrowser chrome = new ChromeBrowser();
        ChromeBrowser.openChromeBrowser();
        chrome.writeURLInChromeAddressBar("www.google.com");// because of non-static variable
        ChromeBrowser.closeChromeBrowser();
        ChromeBrowser.openNewTabInChromeBrowser();
        TextEditor text=new TextEditor();
        text.openTextEditor();
        text.writeIntoTextFile ("This is the execution of writeIntoTextFile() method.");
        text.closeEditor();
        MicrosoftOutLook.openMicrosoftOutlook();
        MicrosoftOutLook.closeOutlook();
        Calculator.addNumbers(15,21);
        Calculator.deductNumbers(112,158);
        Calculator.add3Numbers(12,14,136);
    }

    }



