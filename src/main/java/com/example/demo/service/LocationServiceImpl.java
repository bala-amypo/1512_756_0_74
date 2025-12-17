package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity Le){
        return Locationrepo.save(Le);
    public List<LocationEntity> getall(){
        return Locationrepo findAll();
    }
    }
}
