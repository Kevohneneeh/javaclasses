public class Propertyclass {
    String name,email,pass;

    public Propertyclass(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public String toString(){
        return "Name = "+name+"Email = "+email+"\nPassword = "+pass+"\n\n";
    }
}
