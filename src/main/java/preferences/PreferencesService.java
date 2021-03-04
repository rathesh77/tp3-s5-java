package preferences;

import java.io.IOException;

public interface PreferencesService {
     void save(Preferences preferences) ;
     Preferences load() ;
}
