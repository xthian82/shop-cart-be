package py.com.snowtech.shopcart.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import py.com.snowtech.shopcart.model.Product;
import py.com.snowtech.shopcart.repository.ProductRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    /*public Page<Product> getMockedProducts(Pageable pageable) {
        return new PageImpl<>(Arrays.asList(
                Product.builder().id(1L).name("Guidecraft Interlock").description("Build, design and create with Interlox! No hardware or tools necessary; simply clip the edges together to create an unlimited array of constructions").price(299.0).imageUrl("https://images-na.ssl-images-amazon.com/images/I/61mruGKdZuL._AC_SX425_.jpg").build(),
                Product.builder().id(2L).name("Playmages 30 pieces").description("Let's begin the creativity play, give your child an opportunity to develop and groom their creativity with the Playmag 30 piece set.").price(199.0).imageUrl("https://images-na.ssl-images-amazon.com/images/I/41-cMcHd7kL._AC_.jpg").build(),
                Product.builder().id(3L).name("Children DrawBook").description("Childrens Drawing Book Of Animals Using Only Squares and Triangles Awesome Cossy Kids Magnet toys Magnet Building Tiles 120 Pcs 3d Magnetic Building Blocks Set Educational toys for Kids Children").price(97.43).imageUrl("https://i.pinimg.com/originals/5b/1e/42/5b1e42e8efe8c49f64a5a4a98b29d24e.jpg").build(),
                Product.builder().id(4L).name("Discovery Kids Tiles").description("Children can build 3D models of their own design with these simple triangles and squares. Each colorful piece sticks together with built-in magnets, which let kids place models on an angle to create shapes such as houses, fish, and domes.").price(9.1).imageUrl("https://img.grouponcdn.com/deal/uzKYQHJmX6jun4sNHcts/yb-960x582/v1/c700x420.jpg").build(),
                Product.builder().id(5L).name("Magnet Squares").description("New: A brand-new, unused, unopened and undamaged item. See the seller's listing for full details").price(20.10).imageUrl("https://img1.tongtool.com/u/PNPQUWVVNRPQWMQPNTWQUPYPYPRWURUXTO5b02Z.jpeg").build(),
                Product.builder().id(6L).name("Montessory Children").description("Baby Kids Montessori Children Mathematics Learning Preschool Training Toys Colored Bead Squares 1-10").price(6.65).imageUrl("https://ae01.alicdn.com/kf/HTB1cqEojmMmBKNjSZTEq6ysKpXa3.jpg").build(),
                Product.builder().id(7L).name("Dado Squares").description("Let your kid lay his hands on this Fat Brain Toys set that contains multicoloured Dado Squares and see them constructing their own designs and structures.").price(16.54).imageUrl("https://rukminim1.flixcart.com/image/704/704/puzzle/r/q/2/fat-brain-toys-35-dado-squares-original-imadznagsrx6fzv2.jpeg?q=70").build()
        ));
    }*/
    public List<Product> getMockedProducts() {
        return Arrays.asList(
                Product.builder().id(1L).name("Guidecraft Interlock").description("Build, design and create with Interlox! No hardware or tools necessary; simply clip the edges together to create an unlimited array of constructions").price(299.0).imageUrl("https://images-na.ssl-images-amazon.com/images/I/61mruGKdZuL._AC_SX425_.jpg").build(),
                Product.builder().id(2L).name("Playmages 30 pieces").description("Let's begin the creativity play, give your child an opportunity to develop and groom their creativity with the Playmag 30 piece set.").price(199.0).imageUrl("https://images-na.ssl-images-amazon.com/images/I/41-cMcHd7kL._AC_.jpg").build(),
                Product.builder().id(3L).name("Children DrawBook").description("Childrens Drawing Book Of Animals Using Only Squares and Triangles Awesome Cossy Kids Magnet toys Magnet Building Tiles 120 Pcs 3d Magnetic Building Blocks Set Educational toys for Kids Children").price(97.43).imageUrl("https://i.pinimg.com/originals/5b/1e/42/5b1e42e8efe8c49f64a5a4a98b29d24e.jpg").build(),
                Product.builder().id(4L).name("Discovery Kids Tiles").description("Children can build 3D models of their own design with these simple triangles and squares. Each colorful piece sticks together with built-in magnets, which let kids place models on an angle to create shapes such as houses, fish, and domes.").price(9.1).imageUrl("https://img.grouponcdn.com/deal/uzKYQHJmX6jun4sNHcts/yb-960x582/v1/c700x420.jpg").build(),
                Product.builder().id(5L).name("Magnet Squares").description("New: A brand-new, unused, unopened and undamaged item. See the seller's listing for full details").price(20.10).imageUrl("https://img1.tongtool.com/u/PNPQUWVVNRPQWMQPNTWQUPYPYPRWURUXTO5b02Z.jpeg").build(),
                Product.builder().id(6L).name("Montessory Children").description("Baby Kids Montessori Children Mathematics Learning Preschool Training Toys Colored Bead Squares 1-10").price(6.65).imageUrl("https://ae01.alicdn.com/kf/HTB1cqEojmMmBKNjSZTEq6ysKpXa3.jpg").build(),
                Product.builder().id(7L).name("Dado Squares").description("Let your kid lay his hands on this Fat Brain Toys set that contains multicoloured Dado Squares and see them constructing their own designs and structures.").price(16.54).imageUrl("https://rukminim1.flixcart.com/image/704/704/puzzle/r/q/2/fat-brain-toys-35-dado-squares-original-imadznagsrx6fzv2.jpeg?q=70").build()
        );
    }
}
