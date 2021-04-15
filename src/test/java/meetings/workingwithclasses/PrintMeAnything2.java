package meetings.workingwithclasses;

public class PrintMeAnything2 {
    public PrintMeAnything2(){
        System.out.println("this is constructor");
    }

    public static int numbers = 2134234;
    public void printMeString(String value){
        System.out.println(value);
    }

    private void youdontseeme(){
        System.out.println("nope");
    }

    public static void printmeregardless(){
        System.out.println("yup");
    }
}
