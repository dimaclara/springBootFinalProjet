package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.MvtStkRequestDto;
import marie.teck.gestiondestock.dto.MvtStkResponseDto;

import java.util.List;

public interface MvtStkService {
    MvtStkResponseDto save(MvtStkRequestDto mvtStkDto);
    MvtStkResponseDto findById(Integer id);
    List<MvtStkResponseDto> findAll();
    void delete(Integer id);
    MvtStkResponseDto update(Integer id, MvtStkRequestDto mvtStkDto);
}
