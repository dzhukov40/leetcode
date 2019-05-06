package ru.doneathome.consul;

public interface ConsulKeyValueService {

    String getValueAsString(String key, String defaultValue);

    Integer getValueAsInteger(String key, Integer defaultValue);

    Boolean getValueAsBoolean(String key, Boolean defaultValue);

}
