package com.mycompany.test6;

import com.mycompany.test6.Customers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(CustomerDemographics.class)
public class CustomerDemographics_ { 

    public static volatile SingularAttribute<CustomerDemographics, String> customerTypeId;
    public static volatile CollectionAttribute<CustomerDemographics, Customers> customersCollection;
    public static volatile SingularAttribute<CustomerDemographics, String> customerDesc;

}