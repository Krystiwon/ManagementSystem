public class User {
    private int id;
    private String login;
    private String password;

    public User(){}

    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }
    public int getId(){
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public void setLogin(String login){
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
