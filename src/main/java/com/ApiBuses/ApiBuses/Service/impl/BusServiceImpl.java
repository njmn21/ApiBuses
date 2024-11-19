package com.ApiBuses.ApiBuses.Service.impl;

import com.ApiBuses.ApiBuses.Service.BusService;
import com.ApiBuses.ApiBuses.persistence.entity.Bus;
import com.ApiBuses.ApiBuses.persistence.repository.BusRepository;
import com.ApiBuses.ApiBuses.persistence.repository.MarcaBusRepository;
import com.ApiBuses.ApiBuses.presentation.DTO.BusDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BusServiceImpl implements BusService {

    private final BusRepository busRepository;
    private final MarcaBusRepository marcaBusRepository;

    public BusServiceImpl(BusRepository busRepository, MarcaBusRepository marcaBusRepository) {
        this.busRepository = busRepository;
        this.marcaBusRepository = marcaBusRepository;
    }

    @Override
    public Page<BusDTO> getAll(Pageable pageable) {
        return busRepository.findAll(pageable)
                .map(bus -> new BusDTO(
                        bus.getId(),
                        bus.getNumeroBus(),
                        bus.getPlaca(),
                        bus.getFechaCreacion(),
                        bus.getCaracteristicas(),
                        bus.getMarca().getMarca(),
                        bus.isEstado()
                ));
    }

    @Override
    public Optional<BusDTO> getById(Long id) {
        if(busRepository.existsById(id)) {
            Bus bus = busRepository.findById(id).get();
            return Optional.of(new BusDTO(
                    bus.getId(),
                    bus.getNumeroBus(),
                    bus.getPlaca(),
                    bus.getFechaCreacion(),
                    bus.getCaracteristicas(),
                    bus.getMarca().getMarca(),
                    bus.isEstado()
            ));
        }else {
            return Optional.empty();
        }
    }
}
