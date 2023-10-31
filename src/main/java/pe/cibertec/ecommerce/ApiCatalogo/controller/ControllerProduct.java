package pe.cibertec.ecommerce.ApiCatalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCatalogo.dto.ProductDTO;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Product;
import pe.cibertec.ecommerce.ApiCatalogo.service.ServiceProduct;

@RestController
@RequestMapping("api/v1/product")

public class ControllerProduct {
    
    @Autowired
    
    private ServiceProduct serviceProduct;
    
    @PostMapping("add")
    public ResponseEntity<Product> add (@RequestBody Product product) {
        
        return new ResponseEntity<>(serviceProduct.add(product),HttpStatus.CREATED);
        
    }
    
  @GetMapping("findById/{id}")  
  public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
      
      return new ResponseEntity<>(serviceProduct.findById(id),HttpStatus.OK);
      
  }
    
}
