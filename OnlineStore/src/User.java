import java.util.Objects;
public class User {
    public String username;
    public String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(this == null || getClass()!=obj.getClass())
            return false;
        User user = (User) obj;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);

    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {

        return this.getUsername() + " " + this.getPassword();
    }
}
