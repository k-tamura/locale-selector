package jp.openstandia.keycloak.idaas.locale;

import org.keycloak.Config;
import org.keycloak.locale.LocaleSelectorProvider;
import org.keycloak.locale.LocaleSelectorProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

/**
 * @author 
 */
public class CommonLocaleSelectorProviderFactory implements LocaleSelectorProviderFactory {

    @Override
    public LocaleSelectorProvider create(KeycloakSession session) {
        return new CommonLocaleSelectorProvider(session);
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

    @Override
    public void close() {
    }

    @Override
    public String getId() {
        return "commonLocaleSelector";
    }
}
