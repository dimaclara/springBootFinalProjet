package marie.teck.gestiondestock.service;

import marie.teck.gestiondestock.dto.ArticleRequestDto;
import marie.teck.gestiondestock.dto.ArticleResponseDto;

import java.util.List;

public interface ArticleService {

    ArticleResponseDto save(ArticleRequestDto articleDto);

    ArticleResponseDto findById(Integer id);

    ArticleResponseDto findByCodeArticle(String codeArticle);

    List<ArticleResponseDto> findAll();

    void delete(Integer id);

    ArticleResponseDto update(Integer id, ArticleRequestDto articleDto);

}
