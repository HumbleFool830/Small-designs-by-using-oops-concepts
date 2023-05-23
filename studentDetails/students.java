import java.util.ArrayList;

public class students{
    public static void main(String[] args) {
        ArrayList listNames = new ArrayList<>();
        ArrayList listAges = new ArrayList<>();
        details sunilName = new details("sunil");
        listNames.add(sunilName);
        System.out.println(listNames);
        details sunilAge = new details(19);
        listAges.add(sunilAge);
        System.out.println(listAges);
    }
}