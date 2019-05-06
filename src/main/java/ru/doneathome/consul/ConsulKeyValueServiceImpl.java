package ru.doneathome.consul;


import com.orbitz.consul.Consul;
import com.orbitz.consul.KeyValueClient;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConsulKeyValueServiceImpl implements ConsulKeyValueService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulKeyValueServiceImpl.class);

    private ConsulConfiguration configuration = new ConsulConfiguration();

    private KeyValueClient kvClient;

    public ConsulKeyValueServiceImpl() {
        Consul client = Consul.builder()
                .withUrl(configuration.getConsulClientAddress())
                .build();

        kvClient = client.keyValueClient();
    }

    public ConsulKeyValueServiceImpl(ConsulConfiguration configuration) {
        this.configuration = configuration;

        Consul client = Consul.builder()
                .withUrl(configuration.getConsulClientAddress())
                .build();

        kvClient = client.keyValueClient();
    }


   public String getValueAsString(String key, String defaultValue) {
       LOGGER.debug("get value: key={}", key);
       String environmentDependKey = StringUtils.isNotEmpty(configuration.getEnvironment()) ? configuration.getEnvironment() + "/" + key : key;
       return kvClient.getValueAsString(environmentDependKey).orElse(null);
   }

    public Integer getValueAsInteger(String key, Integer defaultValue) {
       String valueAsString = getValueAsString(key, null);
       return valueAsString == null ? defaultValue : Integer.valueOf(valueAsString);
    }

    public Boolean getValueAsBoolean(String key, Boolean defaultValue) {
        String valueAsString = getValueAsString(key, null);
        return valueAsString == null ? defaultValue : Boolean.valueOf(valueAsString);
    }

}
