package c01.singleton;

public class Settings_Final {

    private Settings_Final() {}

    private static class SettingHolder {
        private static final Settings_Final INSTANCE = new Settings_Final();
    }

    public static Settings_Final getInstance() {
        return SettingHolder.INSTANCE;
    }
}
