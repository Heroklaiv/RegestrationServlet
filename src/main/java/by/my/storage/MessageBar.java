package by.my.storage;

public class MessageBar {
    private static  String messege = "Enter you Username and Password";


    public static String getMessege() {
        return messege;
    }

    public static void setMessege(String messege) {
        MessageBar.messege = messege;
    }
}
