package com.mycompany.test6;

import com.mycompany.test6.Customers;
import com.mycompany.test6.Employees;
import com.mycompany.test6.OrderDetails;
import com.mycompany.test6.Shippers;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, String> shipCity;
    public static volatile SingularAttribute<Orders, Short> orderId;
    public static volatile CollectionAttribute<Orders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Orders, Float> freight;
    public static volatile SingularAttribute<Orders, Date> requiredDate;
    public static volatile SingularAttribute<Orders, Employees> employeeId;
    public static volatile SingularAttribute<Orders, String> shipName;
    public static volatile SingularAttribute<Orders, String> shipPostalCode;
    public static volatile SingularAttribute<Orders, String> shipCountry;
    public static volatile SingularAttribute<Orders, String> shipAddress;
    public static volatile SingularAttribute<Orders, Shippers> shipVia;
    public static volatile SingularAttribute<Orders, Customers> customerId;
    public static volatile SingularAttribute<Orders, Date> orderDate;
    public static volatile SingularAttribute<Orders, Date> shippedDate;
    public static volatile SingularAttribute<Orders, String> shipRegion;

}