package base.pkg.repo;

import base.pkg.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
//import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("SELECT p FROM ProductEntity p JOIN FETCH p.variations v WHERE p.id = :productId")
    ProductEntity findByIdWithVariations(@Param("productId") Long productId);

    @Query("SELECT p, v FROM ProductEntity p JOIN p.variations v WHERE p.id = :productId")
    List<Object[]> findVariableProductById(@Param("productId") Long productId);

    @Query("SELECT p FROM ProductEntity p WHERE p.id = :productId")
    ProductEntity findSimpleProductById(@Param("productId") Long productId);

}
