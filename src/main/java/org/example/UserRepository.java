package org.example;


import java.util.ArrayList;
import java.util.List;

public class UserRepository
{
    List<User> users;

    public UserRepository()
    {
        users = new ArrayList<>();
    }

    public void add(User u)
    {
        users.add(u);
    }

    public User get(int x)
    {
        User u = null;
        for(int i=0;i<users.size();i++)
        {
            User ui = users.get(i);
            if(ui.uid==x)
            {
                u=ui;
                break;
            }
        }
        return u;
    }

    public synchronized void increment(int x)
    {
        User u = null;
        for(int i=0;i<users.size();i++)
        {
            User ui = users.get(i);
            if(ui.uid==x)
            {
                u=ui;
                break;
            }
        }
        int cp = u.param;
        int ne = cp+1;
        u.param=ne;
    }
}
