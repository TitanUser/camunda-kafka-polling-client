package de.viadee.camunda.kafka.pollingclient.config.properties;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Properties for polling using Camunda REST API
 *
 * @author viadee
 * @version $Id: $Id
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "polling.camunda.rest")
public class CamundaRestPollingProperties {

    /**
     * URL of Camunda REST API
     */
    private String url;

    /**
     * Username used for authentication
     */
    private String username;

    /**
     * Password used for authentication
     */
    private String password;

    /**
     * <p>isAuthenticationEnabled.</p>
     *
     * @return a boolean.
     */
    public boolean isAuthenticationEnabled() {
        return StringUtils.isNotEmpty(username);
    }
}
