package com.mycompany.test6;

import com.mycompany.test6.OrderDetailsPK;
import com.mycompany.test6.Orders;
import com.mycompany.test6.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, Float> unitPrice;
    public static volatile SingularAttribute<OrderDetails, OrderDetailsPK> orderDetailsPK;
    public static volatile SingularAttribute<OrderDetails, Short> quantity;
    public static volatile SingularAttribute<OrderDetails, Float> discount;
    public static volatile SingularAttribute<OrderDetails, Orders> orders;
    public static volatile SingularAttribute<OrderDetails, Products> products;

}