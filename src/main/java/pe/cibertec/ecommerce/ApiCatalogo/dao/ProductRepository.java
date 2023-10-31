package pe.cibertec.ecommerce.ApiCatalogo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
