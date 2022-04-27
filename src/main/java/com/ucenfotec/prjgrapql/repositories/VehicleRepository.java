package com.ucenfotec.prjgrapql.repositories;

import com.ucenfotec.prjgrapql.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}

