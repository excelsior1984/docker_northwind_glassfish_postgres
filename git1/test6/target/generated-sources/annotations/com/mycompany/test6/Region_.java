package com.mycompany.test6;

import com.mycompany.test6.Territories;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Region.class)
public class Region_ { 

    public static volatile CollectionAttribute<Region, Territories> territoriesCollection;
    public static volatile SingularAttribute<Region, Short> regionId;
    public static volatile SingularAttribute<Region, String> regionDescription;

}