package com.mycompany.test6;

import com.mycompany.test6.CustomerDemographics;
import com.mycompany.test6.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> country;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> city;
    public static volatile SingularAttribute<Customers, String> contactName;
    public static volatile SingularAttribute<Customers, String> companyName;
    public static volatile SingularAttribute<Customers, String> postalCode;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;
    public static volatile CollectionAttribute<Customers, CustomerDemographics> customerDemographicsCollection;
    public static volatile SingularAttribute<Customers, String> contactTitle;
    public static volatile SingularAttribute<Customers, String> phone;
    public static volatile SingularAttribute<Customers, String> customerId;
    public static volatile SingularAttribute<Customers, String> region;
    public static volatile SingularAttribute<Customers, String> fax;

}