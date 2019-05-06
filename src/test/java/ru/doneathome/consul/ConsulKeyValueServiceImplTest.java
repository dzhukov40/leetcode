package ru.doneathome.consul;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsulKeyValueServiceImplTest {

    @Ignore
    @Test
    public void getValueAsString() {
        ConsulKeyValueServiceImpl consulKeyValueService = new ConsulKeyValueServiceImpl();

        String key = "tort";
        String defaultValue = "  ";
        String aspectResult = "Hello Denis! environment PROD";

        String result = consulKeyValueService.getValueAsString(key, defaultValue);
        Assert.assertEquals(result, aspectResult);
    }

    @Test
    public void getValueAsStringFromEnvironment() {
        ConsulKeyValueServiceImpl consulKeyValueService = new ConsulKeyValueServiceImpl();

        String key = "tort";
        String defaultValue = "  ";
        String aspectResult = "Hello Denis! environment AURA";

        String result = consulKeyValueService.getValueAsString(key, defaultValue);
        Assert.assertEquals(result, aspectResult);
    }

    @Test
    public void getValueAsInteger() {
    }

    @Test
    public void getValueAsBoolean() {
    }
}