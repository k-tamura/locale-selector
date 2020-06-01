SPIは以下で登録

```bash
jboss-cli.sh --command="module add --name=jp.openstandia.keycloak.idaas.locale --resources=target/locale-selector.jar --dependencies=org.keycloak.keycloak-core,org.keycloak.keycloak-server-spi,org.keycloak.keycloak-server-spi-private,org.keycloak.keycloak-services,org.keycloak.keycloak-common,javax.ws.rs.api"
```

standalone.xmlの適切な位置に以下の2つを追加

```xml
<provider>module:jp.openstandia.keycloak.idaas.locale</provider>
```

```xml
<spi name="localeSelector">
    <default-provider>commonLocaleSelector</default-provider>
    <provider name="commonLocaleSelector" enabled="true">
    </provider>
</spi>
```
