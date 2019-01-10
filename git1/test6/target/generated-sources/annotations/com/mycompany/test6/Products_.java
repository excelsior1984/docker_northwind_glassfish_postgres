package com.mycompany.test6;

import com.mycompany.test6.Categories;
import com.mycompany.test6.OrderDetails;
import com.mycompany.test6.Suppliers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, Float> unitPrice;
    public static volatile SingularAttribute<Products, Short> unitsInStock;
    public static volatile SingularAttribute<Products, Short> reorderLevel;
    public static volatile SingularAttribute<Products, Suppliers> supplierId;
    public static volatile SingularAttribute<Products, Short> productId;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Products, String> quantityPerUnit;
    public static volatile SingularAttribute<Products, Integer> discontinued;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, Short> unitsOnOrder;
    public static volatile SingularAttribute<Products, Categories> categoryId;

}