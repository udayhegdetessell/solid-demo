package com.example.solid_demo.solid.lsp.better.service.impl;

import com.example.solid_demo.solid.lsp.better.repository.Repository;
import java.util.Optional;
import org.springframework.stereotype.Service;


/**
 * @author udayhegde
 */
@Service
public class GenericDataService {
    
    public <T, ID> Optional<T> findEntityById(Repository<T, ID> repository, ID id) {
        // Works with any Repository implementation due to LSP
        return repository.findById(id);
    }
}