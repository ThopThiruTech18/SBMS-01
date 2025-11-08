package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
