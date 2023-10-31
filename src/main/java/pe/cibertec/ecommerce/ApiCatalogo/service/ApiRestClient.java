package pe.cibertec.ecommerce.ApiCatalogo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Category;

@FeignClient(value = "category-service", url = "http://localhost:8081/")

public interface ApiRestClient {

    @GetMapping("api/v1/category/findCategorySK/{categorySK}")
    Category findByCategorySK(@PathVariable String CategorySK);
    
}


