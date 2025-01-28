package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class User
{
    int uid;
    String mob;
    String name;
    AtomicInteger param;

    public User(int id, String ph, String nm)
    {
        uid=id; mob=ph; name=nm;
        param= new AtomicInteger();
    }

}
