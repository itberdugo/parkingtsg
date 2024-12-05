package com.it.parkingtsg.controllers.vehicletype;

import com.it.parkingtsg.entities.VehicleType;
import com.it.parkingtsg.exceptions.ApplicationException;
import com.it.parkingtsg.services.vehicletype.VehicleTypeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/vehicle-type")
@RequiredArgsConstructor
public class VehicleTypeController {

    private final VehicleTypeServices engineTypeServices;

    @PostMapping("/")
    public void saveEngine(@RequestBody VehicleType vehicleType){
        engineTypeServices.saveVehicleType(vehicleType);
    }

    @GetMapping("/")
    public ResponseEntity<List<VehicleType>> getEngine(){
        return ResponseEntity.ok(engineTypeServices.getVehiclesType());
    }

    @GetMapping("/{vehicle-type-id}")
    public ResponseEntity<VehicleType> getEngineById(@PathVariable("vehicle-type-id")
           final Long vehicleTypeId)throws ApplicationException {
        return ResponseEntity.ok(engineTypeServices.getVehiclesTypeById(vehicleTypeId));
    }
}
