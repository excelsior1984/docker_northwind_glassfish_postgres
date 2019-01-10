package com.mycompany.test6;

import com.mycompany.test6.Employees;
import com.mycompany.test6.Orders;
import com.mycompany.test6.Territories;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-10T19:26:21")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, String> lastName;
    public static volatile SingularAttribute<Employees, String> country;
    public static volatile SingularAttribute<Employees, Date> hireDate;
    public static volatile SingularAttribute<Employees, String> extension;
    public static volatile SingularAttribute<Employees, String> address;
    public static volatile SingularAttribute<Employees, String> notes;
    public static volatile SingularAttribute<Employees, String> city;
    public static volatile SingularAttribute<Employees, String> photoPath;
    public static volatile SingularAttribute<Employees, String> postalCode;
    public static volatile SingularAttribute<Employees, String> homePhone;
    public static volatile SingularAttribute<Employees, byte[]> photo;
    public static volatile SingularAttribute<Employees, Short> employeeId;
    public static volatile SingularAttribute<Employees, Employees> reportsTo;
    public static volatile CollectionAttribute<Employees, Orders> ordersCollection;
    public static volatile SingularAttribute<Employees, String> title;
    public static volatile SingularAttribute<Employees, String> titleOfCourtesy;
    public static volatile SingularAttribute<Employees, Date> birthDate;
    public static volatile CollectionAttribute<Employees, Employees> employeesCollection;
    public static volatile SingularAttribute<Employees, String> firstName;
    public static volatile CollectionAttribute<Employees, Territories> territoriesCollection;
    public static volatile SingularAttribute<Employees, String> region;

}