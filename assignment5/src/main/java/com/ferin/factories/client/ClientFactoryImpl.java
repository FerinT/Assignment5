package com.ferin.factories.client;


import com.ferin.client.impl.Business;
import com.ferin.client.impl.Premium;
import com.ferin.client.impl.Standard;

public abstract class ClientFactoryImpl {

    public static ClientFactory getClientType(String type)
    {
        if(type.equalsIgnoreCase("business"))
            return new Business();
        if(type.equalsIgnoreCase("premium"))
            return new Premium();
        if(type.equalsIgnoreCase("standard"))
            return new Standard();
        else
            return null;
    }

}
