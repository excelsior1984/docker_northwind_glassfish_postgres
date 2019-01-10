package com.mycompany.test6;

import com.mycompany.test6.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Suppliers.class)
public class Suppliers_ { 

    public static volatile SingularAttribute<Suppliers, String> country;
    public static volatile SingularAttribute<Suppliers, Short> supplierId;
    public static volatile SingularAttribute<Suppliers, String> address;
    public static volatile SingularAttribute<Suppliers, String> city;
    public static volatile SingularAttribute<Suppliers, String> contactName;
    public static volatile SingularAttribute<Suppliers, String> companyName;
    public static volatile SingularAttribute<Suppliers, String> postalCode;
    public static volatile SingularAttribute<Suppliers, String> contactTitle;
    public static volatile SingularAttribute<Suppliers, String> phone;
    public static volatile CollectionAttribute<Suppliers, Products> productsCollection;
    public static volatile SingularAttribute<Suppliers, String> region;
    public static volatile SingularAttribute<Suppliers, String> fax;
    public static volatile SingularAttribute<Suppliers, String> homepage;

}