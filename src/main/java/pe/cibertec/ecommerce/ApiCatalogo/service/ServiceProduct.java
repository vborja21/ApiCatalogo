package pe.cibertec.ecommerce.ApiCatalogo.service;

import pe.cibertec.ecommerce.ApiCatalogo.dto.ProductDTO;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Product;

public interface ServiceProduct {
    
    Product add(Product product); 
    ProductDTO findById (Long id); 
}
