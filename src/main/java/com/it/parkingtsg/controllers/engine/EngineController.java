package com.it.parkingtsg.controllers.engine;

import com.it.parkingtsg.entities.EngineType;
import com.it.parkingtsg.exceptions.ApplicationException;
import com.it.parkingtsg.services.engine.EngineTypeServices;
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
@RequestMapping("api/v1/engine")
@RequiredArgsConstructor
public class EngineController {

    private final EngineTypeServices engineTypeServices;

    @PostMapping("/")
    public void saveEngine(@RequestBody EngineType engineType){
        engineTypeServices.saveEngine(engineType);
    }

    @GetMapping("/")
    public ResponseEntity<List<EngineType>> getEngine(){
        return ResponseEntity.ok(engineTypeServices.getEngine());
    }

    @GetMapping("/{engine-id}")
    public ResponseEntity<EngineType> getEngineById(@PathVariable("engine-id")
           final Long engineId)throws ApplicationException {
        return ResponseEntity.ok(engineTypeServices.getEngineById(engineId));
    }
}
