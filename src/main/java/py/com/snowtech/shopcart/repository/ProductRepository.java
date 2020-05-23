package py.com.snowtech.shopcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.com.snowtech.shopcart.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
