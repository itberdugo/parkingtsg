package com.it.parkingtsg.services.vehicletype;

import com.it.parkingtsg.entities.VehicleType;
import com.it.parkingtsg.exceptions.ApplicationException;
import com.it.parkingtsg.exceptions.NotFoundException;
import com.it.parkingtsg.repository.VehicleTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleTypeServices {

    private final VehicleTypeRepository vehicleTypeRepository;

    public void saveVehicleType(final VehicleType vehicleType){
        vehicleTypeRepository.save(
                vehicleType
        );
    }

    public VehicleType getVehiclesTypeById(final Long vehicleTypeId) throws ApplicationException {
        return vehicleTypeRepository.findById(vehicleTypeId).
                orElseThrow(() -> new NotFoundException("Engine with id not found"));
    }

    public List<VehicleType> getVehiclesType(){
        return vehicleTypeRepository.findAll();
    }
}
