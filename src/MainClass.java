import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Propertyclass>list;
        list= new ArrayList<Propertyclass>();
        Propertyclass user;
        user= new Propertyclass("King","king@gmail.com","12345");
        list.add(user);

        user = new Propertyclass("emobilis","emobilis@gmail.com","3456");
        list.add(user);

        user = new Propertyclass("Kim","kim@gmail.com","233344");
        list.add(user);

        System.out.println(list.toString());
    }
}
