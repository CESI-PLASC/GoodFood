package fr.goodfood.service.mapper;

import java.util.List;

public interface EntityMapper <D, S, E> {

    E toEntity(D dto);

    D toDto(E entity);

    List <E> toEntities(List<D> dtoList);

    List <D> toDtos(List<E> entityList);

    S toSimpleDto(E entity);

    List <S> toSimpleDtos(List<E> entityList);
}

