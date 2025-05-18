class userRequest {
    
    @w
    private String name;

    @w // not blank
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class x {
    public static void main(String[] args) {
        userRequest user = new userRequest();

        // caranya gini 
        // ValidationUtil.validationReflection(user);
        
    }
}