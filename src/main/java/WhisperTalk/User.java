package WhisperTalk;

public class User {

    private Integer id;
    private String name;
    private String password;

    public User(Integer id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public void setId( Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
