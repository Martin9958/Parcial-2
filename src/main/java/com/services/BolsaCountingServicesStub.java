/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.model.Bolsa;
import com.model.Meta;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.PostConstruct;

/**
 *
 * @author 2124519
 */
public class BolsaCountingServicesStub implements BolsaCountingService{

    public  List<Bolsa>meta = new CopyOnWriteArrayList<>();
    
    
    @PostConstruct
    public void populateData(){
        
    }

    
    @Override
    public List<Bolsa> consultarAccionesNegociadasPorEmpresa(String empresa) {
          return meta;
    }
    
}
