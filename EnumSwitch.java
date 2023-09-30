enum Year{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}
public class EnumSwitch {
    public static void main(String[] args) {
        Year ye = Year.SEP;
        String str = switch(ye){
            case FEB -> ye+" is 29 or 28 days";
            case APR,JUN,SEP,NOV -> ye+" is 30 days";
            default -> ye+" have 31 days";
        };
        System.out.println(str);
    }
}
