package com.it.parkingtsg.services.engine;

import com.it.parkingtsg.entities.EngineType;
import com.it.parkingtsg.exceptions.ApplicationException;
import com.it.parkingtsg.exceptions.NotFoundException;
import com.it.parkingtsg.repository.EngineTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EngineTypeServices {

    private final EngineTypeRepository engineTypeRepository;

    public void saveEngine(final EngineType engineType){
        engineTypeRepository.save(
                engineType
        );
    }

    public EngineType getEngineById(final Long engineId) throws ApplicationException {
        return engineTypeRepository.findById(engineId).
                orElseThrow(() -> new NotFoundException("Engine with id not found"));
    }

    public List<EngineType> getEngine(){
        return engineTypeRepository.findAll();
    }
}
