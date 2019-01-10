package com.mycompany.test6;

import com.mycompany.test6.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Shippers.class)
public class Shippers_ { 

    public static volatile SingularAttribute<Shippers, Short> shipperId;
    public static volatile SingularAttribute<Shippers, String> phone;
    public static volatile SingularAttribute<Shippers, String> companyName;
    public static volatile CollectionAttribute<Shippers, Orders> ordersCollection;

}