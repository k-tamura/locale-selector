package jp.openstandia.keycloak.idaas.locale;

import org.keycloak.locale.DefaultLocaleSelectorProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import javax.ws.rs.core.HttpHeaders;
import java.util.List;
import java.util.Locale;

/**
 * @author
 */
public class CommonLocaleSelectorProvider extends DefaultLocaleSelectorProvider {

    private KeycloakSession session;

    public CommonLocaleSelectorProvider(KeycloakSession session) {
        super(session);
        this.session = session;
    }

    @Override
    public Locale resolveLocale(RealmModel realm, UserModel user) {
        if (user == null) {
            HttpHeaders requestHeaders = this.session.getContext().getRequestHeaders();
            List<Locale> acceptableLanguages = requestHeaders.getAcceptableLanguages();
            for (Locale acceptableLanguage : acceptableLanguages) {
                return acceptableLanguage;
            }
        }
        return super.resolveLocale(realm, user);
    }
}
