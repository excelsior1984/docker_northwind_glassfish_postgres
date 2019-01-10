/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author root
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.CategoriesFacadeREST.class);
        resources.add(service.CustomerDemographicsFacadeREST.class);
        resources.add(service.CustomersFacadeREST.class);
        resources.add(service.EmployeesFacadeREST.class);
        resources.add(service.OrderDetailsFacadeREST.class);
        resources.add(service.OrdersFacadeREST.class);
        resources.add(service.ProductsFacadeREST.class);
        resources.add(service.RegionFacadeREST.class);
        resources.add(service.ShippersFacadeREST.class);
        resources.add(service.SuppliersFacadeREST.class);
        resources.add(service.TerritoriesFacadeREST.class);
        resources.add(service.UsStatesFacadeREST.class);
    }
    
}
