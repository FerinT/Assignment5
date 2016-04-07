package com.ferin;


import com.ferin.client.Client;
import com.ferin.client.impl.Premium;
import com.ferin.client.impl.Standard;
import com.ferin.factories.client.ClientFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClient {
    @Test
    public void testNull() throws Exception {
        Client client = ClientFactoryImpl.getClientType("Business").getClient("123", "321");
        Assert.assertNotNull(client.getInstance());
    }

    @Test
    public void testStandard() throws Exception {
        Assert.assertEquals(ClientFactoryImpl.getClientType("standard").getClass(), new Standard().getClass());
    }

    @Test
    public void testPremium() throws Exception {
        Assert.assertEquals(ClientFactoryImpl.getClientType("premium").getClass(), new Premium().getClass());
    }

    @Test
    public void testUpdate() throws Exception {
        Client client1 = ClientFactoryImpl.getClientType("Business").getClient("123", "taylor");
        Client client = new Client.Builder()
                .idNumber("123")
                .name("ferin")
                .copy(client1)
                .build();
        Assert.assertEquals(client.getName(), "taylor");
    }
}
