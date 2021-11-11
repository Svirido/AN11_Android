public class Main {
    public static void main(String[] args) {

        boolean login = checklogin();
        System.out.println("Логин " + login);
        boolean password = checkPassword();
        System.out.println("Пароль " + password);
        boolean confirmPassword = checkConfirmPassword();
        System.out.println("Совподение паролей " + confirmPassword);
    }


    public static String inputLogin() throws WrongLoginException {
        String login = "Svirido";
        if (login.length() > 20) throw new WrongLoginException("Не верный логин");
        return login;
    }

    public static boolean checklogin() {
        try {
            inputLogin();
            return true;
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public static String inputPassword() throws WrongPasswordException {
        String password = "password";
        if (password.length() > 20) throw new WrongPasswordException("Не верный пароль");
        return password;
    }

    public static boolean checkPassword() {
        try {
            inputPassword();
            return true;
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public static String inputConfirmPassword() throws WrongPasswordException {
        String confirmPassword = "password";
        if (!confirmPassword.equals("password")) throw new WrongPasswordException("Пароли не совподают");
        return confirmPassword;
    }

    public static boolean checkConfirmPassword() {
        try {
            inputConfirmPassword();
            return true;
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
