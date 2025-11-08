package in.thiru;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Product;
import in.thiru.repo.ProductRepo;

@SpringBootApplication
public class No10H2DbProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No10H2DbProjectApplication.class, args);

		ProductRepo prodRepo = run.getBean(ProductRepo.class);

		List<Product> products = new ArrayList<>();

		products.add(new Product("book", 1000.0));
		products.add(new Product("laptop", 2000.0));
		products.add(new Product("pen", 500.0));
		products.add(new Product("mouse", 20000.0));
		products.add(new Product("watch", 5000.0));

		List<Product> products1 = prodRepo.saveAll(products);

		if (products1 != null)
			System.out.println("Product saved successfully....");
		else
			System.out.println("Product Not saved successfully...");
	}

}
