package Sem4.Task1;

public class Employee {
    private String login;
    private String password;
    private String confirmPassword;

    public Employee(String login, String password, String confirmPassword) {
        if (login.length() < 20) {
            this.login = login;
        }else {
            //throw new
        }

        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public Employee setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public Employee setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
