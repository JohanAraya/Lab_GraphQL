package com.ucenfotec.prjgrapql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.Optional;
import java.util.List;
import com.ucenfotec.prjgrapql.entities.Vehicle;
import com.ucenfotec.prjgrapql.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;
    public List<Vehicle> getVehicles(int count) {
        return this.vehicleService.getAllVehicles(count);
    }
    public Optional<Vehicle> getVehicle(int id) {
        return this.vehicleService.getVehicle(id);
    }

}
