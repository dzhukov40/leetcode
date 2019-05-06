package ru.doneathome.consul;

import javax.annotation.Resource;

public class ConsulConfiguration {
    /**
     *
     */
    @Resource(lookup = "java:global/....")
    private String consulClientAddress = "http://127.0.0.1:8500";

    /**
     *
     */
    @Resource(lookup = "java:global/....")
    private String environment = "AURA";


    public String getConsulClientAddress() {
        return consulClientAddress;
    }

    public void setConsulClientAddress(String consulClientAddress) {
        this.consulClientAddress = consulClientAddress;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
