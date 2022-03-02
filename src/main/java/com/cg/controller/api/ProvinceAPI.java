package com.cg.controller.api;


import com.cg.model.Province;
import com.cg.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/provinces")
public class ProvinceAPI<IProvinceService> {

    @Autowired
    private IProvinceService provinceService;

    @GetMapping
    public ResponseEntity<Iterable<Province>> allProvinces() {
        Iterable<Province> provinces = provinceService.findAll();
        if (((List) provinces).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(provinces, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Province> deleteProvince(@PathVariable Long id) {
        Optional<Province> provinceOptional = provinceService.findById(id);
        if (!provinceOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        provinceService.remove(id);
        return new ResponseEntity<>(provinceOptional.get(), HttpStatus.NO_CONTENT);
    }
}
