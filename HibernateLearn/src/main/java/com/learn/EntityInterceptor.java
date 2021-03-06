package com.learn;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Iterator;

public class EntityInterceptor extends EmptyInterceptor {


    public void onDelete(Object entity,
                         Serializable id,
                         Object[] state,
                         String[] propertyNames,
                         Type[] types) {
        // do nothing
    }

    // This method is called when Employee object gets updated.
    public boolean onFlushDirty(Object entity,
                                Serializable id,
                                Object[] currentState,
                                Object[] previousState,
                                String[] propertyNames,
                                Type[] types) {
        if (entity instanceof Employee) {
            System.out.println("Update Operation");
            return true;
        }
        return false;
    }

    public boolean onLoad(Object entity,
                          Serializable id,
                          Object[] state,
                          String[] propertyNames,
                          Type[] types) {
        // do nothing
        return true;
    }

    // This method is called when Employee object gets created.
    public boolean onSave(Object entity,
                          Serializable id,
                          Object[] state,
                          String[] propertyNames,
                          Type[] types) {
        if (entity instanceof Employee) {
            System.out.println("Create Operation");
            return true;
        }
        return false;
    }

    //called before commit into database
    public void preFlush(Iterator iterator) {
        System.out.println("preFlush invoked.");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    //called after committed into database
    public void postFlush(Iterator iterator) {
        System.out.println("postFlush  invoked.");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
