package ProjectSpringWeb.service.impl;

import ProjectSpringWeb.model.Store;
import ProjectSpringWeb.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreService{

    private final StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }

    public Optional<Store> getStoreByName(String storeName) {
        return storeRepository.findByStoreName(storeName);
    }

}
