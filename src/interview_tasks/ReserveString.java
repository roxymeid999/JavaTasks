package interview_tasks;

public class ReserveString {

    public static String reserveStr(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result+= str.charAt(i);
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(reserveStr("apple"));
    }
}
