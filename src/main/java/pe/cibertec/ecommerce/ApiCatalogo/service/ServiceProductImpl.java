package pe.cibertec.ecommerce.ApiCatalogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCatalogo.dao.ProductRepository;
import pe.cibertec.ecommerce.ApiCatalogo.dto.ProductDTO;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Category;
import pe.cibertec.ecommerce.ApiCatalogo.entity.Product;

@Service
public class ServiceProductImpl implements ServiceProduct {

    @Autowired

    private ProductRepository productRepository;

    @Autowired
    
    private ApiRestClient apiRestClient;
    
    @Override

    public Product add(Product product) {

        return productRepository.save(product);

    }

    @Override
    public ProductDTO findById(Long id) {

       Product product = productRepository.findById(id).get();
       
        Category category = apiRestClient.findByCategorySK(product.getCategorySK());
       
       ProductDTO productDto = new ProductDTO();
       productDto.setId(product.getId());
       productDto.setProductName(product.getProductName());
       productDto.setUnitPrice(product.getUnitPrice());
       productDto.setCategory(category);
       
       return productDto;
       
    }

}
