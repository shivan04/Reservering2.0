package sr.unasat;


import jakarta.ws.rs.core.Application;
import sr.unasat.config.JPAconfiguration;

import javax.ws.rs.ApplicationPath;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("jersey.config.server.provider.packages", "sr.unasat.controller");
//        JPAconfiguration.getEntityManager();
        return properties;
    }
}



