package br.espm.poo.carteira.common.controller;

import br.espm.poo.carteira.common.datatype.Carteira;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("carteira-service")
public interface CarteiraController {

    @GetMapping("carteiras/{id}")
    Carteira carteira(String id);

}
