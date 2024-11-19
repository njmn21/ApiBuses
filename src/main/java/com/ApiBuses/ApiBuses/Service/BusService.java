package com.ApiBuses.ApiBuses.Service;

import com.ApiBuses.ApiBuses.persistence.entity.Bus;
import com.ApiBuses.ApiBuses.presentation.DTO.BusDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BusService {

    Page<BusDTO> getAll(Pageable pageable);
    Optional<BusDTO> getById(Long id);
}
