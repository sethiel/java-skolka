package cz.oxy.skolka.service;

import cz.oxy.skolka.dao.BasketDao;
import cz.oxy.skolka.dto.*;
import cz.oxy.skolka.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Service
public class BasketService {
    @Autowired
    private BasketDao basketDao;

    @Transactional(readOnly = true)
    public BasketDto getBasket(int id) {
        final BasketEntity basketEntity = basketDao.getOne(id);
        return convert(basketEntity);
    }

    private BasketDto convert(BasketEntity basketEntity) {
        return BasketDto.builder()
                .basketRows(basketEntity.getBasketRows().stream()
                    .map(this::convert)
                    .collect(Collectors.toList())
                )
                .build();
    }

    private BasketRowDto convert(BasketRowEntity basketRowEntity) {
        return BasketRowDto.builder()
                .quantity(basketRowEntity.getQuantity())
                .product(convert(basketRowEntity.getProduct()))
                .build();
    }

    private ProductDto convert(ProductEntity productEntity) {
        return ProductDto.builder()
                .title(productEntity.getTitle())
                .price(productEntity.getPrice())
                .build();
    }
}
