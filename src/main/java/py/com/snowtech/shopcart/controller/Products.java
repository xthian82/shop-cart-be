package py.com.snowtech.shopcart.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.com.snowtech.shopcart.model.Product;
import py.com.snowtech.shopcart.service.ProductService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/products", produces = APPLICATION_JSON_VALUE)
class Products {

    private final ProductService productService;

    Products(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    Page<Product> products(Pageable pageable) {
        return productService.getProducts(pageable);

    }

    @GetMapping("/mock")
    List<Product> mockProducts() {
        return productService.getMockedProducts();
    }
}
