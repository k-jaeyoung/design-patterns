package c01.singleton;

public class App {

    public static void main(String[] args) {
        Settings_Enum settings = Settings_Enum.INSTANCE;
        Settings_Enum settings1 = Settings_Enum.INSTANCE;

        System.out.println(settings == settings1);
    }
}
