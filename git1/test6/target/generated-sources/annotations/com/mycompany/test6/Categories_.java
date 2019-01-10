package com.mycompany.test6;

import com.mycompany.test6.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile CollectionAttribute<Categories, Products> productsCollection;
    public static volatile SingularAttribute<Categories, String> description;
    public static volatile SingularAttribute<Categories, String> categoryName;
    public static volatile SingularAttribute<Categories, Short> categoryId;
    public static volatile SingularAttribute<Categories, byte[]> picture;

}