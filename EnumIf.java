enum Weeks{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
public class EnumIf {
    public static void main(String[] args) {
        Weeks ws = Weeks.SATURDAY;
        if(ws == Weeks.MONDAY)
            System.out.println(ws+" is bad day");  
        else if(ws == Weeks.TUESDAY)
            System.out.println(ws+" is nice day");
        else if(ws == Weeks.FRIDAY)
            System.out.println(ws+" is good day");
        else if(ws == Weeks.SATURDAY)
            System.out.println(ws+" is party day");
        else if(ws == Weeks.SUNDAY)
            System.out.println(ws+" is weekend day");
        else
            System.out.println(ws+" is busy day");
    }
}
