package preferences;

import java.io.IOException;

public interface PreferencesService {
     void save(Preferences preferences) throws IOException;
     Preferences load() throws IOException;
}
