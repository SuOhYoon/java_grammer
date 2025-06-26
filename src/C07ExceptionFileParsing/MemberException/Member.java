package C07ExceptionFileParsing.MemberException;

public class Member {
    static long id;
    String name;
    String email;
    String password;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Member.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
