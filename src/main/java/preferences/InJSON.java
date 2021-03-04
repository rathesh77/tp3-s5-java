package preferences;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class InJSON implements PreferencesService {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void save(Preferences preferences) throws IOException {
        try {
            objectMapper.writeValue(new File("preferences.json"), preferences);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Preferences load()  {
        Preferences pref = null;
        try {
            pref = objectMapper.readValue(new File("preferences.json"), Preferences.class);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return pref;
    }
}
