package preferences;

import java.io.File;

public class InMemory implements PreferencesService {

    private Preferences preferences;
    @Override
    public void save(Preferences preferences) {
        this.preferences = preferences;
    }

    @Override
    public Preferences load() {

        return preferences;
    }
}
