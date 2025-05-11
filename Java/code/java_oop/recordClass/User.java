package recordClass;


public record User(String username, String password) {

    public User{
        System.out.println("Make object..");
    }

    public User(String username){
        this(username, "");
    }

    public User(){
        this("", "");
    }
}
