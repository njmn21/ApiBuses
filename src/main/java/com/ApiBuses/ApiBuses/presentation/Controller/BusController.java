package com.ApiBuses.ApiBuses.presentation.Controller;

import com.ApiBuses.ApiBuses.Service.BusService;
import com.ApiBuses.ApiBuses.presentation.DTO.BusDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/buses")
public class BusController {

    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public ResponseEntity<Page<BusDTO>> getAll(@PageableDefault(page = 0, size = 10) Pageable pageable) {
        return ResponseEntity.ok(busService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<BusDTO>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(busService.getById(id));
    }
}
