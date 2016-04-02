package com.ferin;

import com.ferin.domain.Client;
import com.ferin.factories.Client.ClientFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClient {

    Client client;

    @Test
    public void testNullness() throws Exception {
        client = new Client.Builder()
                .name("Ferin")
                .build();
        Assert.assertNotNull(client);
    }

    @Test
    public void testData() throws Exception {
        client = new Client.Builder()
                .idNumber("123")
                .build();
        Assert.assertEquals(client.getIdNumber(), "123");
    }

    @Test
    public void testExisits() throws Exception {
        Assert.assertNotNull(ClientFactoryImpl.getInstance());
    }

    @Test
    public void testOutput() throws Exception {
        client  = new ClientFactoryImpl().createClient("1", "1");
        Assert.assertEquals(client.getName(), "Ferin");
    }
}
