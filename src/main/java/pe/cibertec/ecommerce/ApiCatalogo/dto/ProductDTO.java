package pe.cibertec.ecommerce.ApiCatalogo.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Category;

@Data

public class ProductDTO {
    
    private Long id;
    private String productName;
    private Long unitPrice;
    private Category category;
    
}
