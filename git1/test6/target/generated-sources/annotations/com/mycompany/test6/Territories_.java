package com.mycompany.test6;

import com.mycompany.test6.Employees;
import com.mycompany.test6.Region;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Territories.class)
public class Territories_ { 

    public static volatile CollectionAttribute<Territories, Employees> employeesCollection;
    public static volatile SingularAttribute<Territories, String> territoryDescription;
    public static volatile SingularAttribute<Territories, Region> regionId;
    public static volatile SingularAttribute<Territories, String> territoryId;

}