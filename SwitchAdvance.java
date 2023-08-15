public class SwitchAdvance {
    public static void main(String[] args) {
        String day = "Saturday";
        String result = " ";
        result = switch(day){
            case "Monday","Sunday":yield"8am";
            case "Tuesday","Wednesday","Thursday":yield "7am";
            default :yield"6am";
        };
        System.out.println(result);
    }
}
