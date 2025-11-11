package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Book;
import in.thiru.repo.BookRepo;

@SpringBootApplication
public class No03ProfilesProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No03ProfilesProjectApplication.class, args);
		
		BookRepo bean = run.getBean(BookRepo.class);
		
		Book b=new Book();
		b.setBookName("TTT");
		b.setBookPrice(500.00);
		
		bean.save(b);
	}

}
