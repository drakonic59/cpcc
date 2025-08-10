package fr.hattane.ilias.rtt.cpcc;

import java.io.File;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import fr.hattane.ilias.rtt.cpcc.entity.User;
import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import fr.hattane.ilias.rtt.cpcc.entity.products.ProductCategory;
import fr.hattane.ilias.rtt.cpcc.service.FileService;
import fr.hattane.ilias.rtt.cpcc.service.UserService;
import fr.hattane.ilias.rtt.cpcc.service.products.ProductCategoryService;
import fr.hattane.ilias.rtt.cpcc.service.products.ProductService;

@SpringBootApplication
public class CpccApplication implements CommandLineRunner {
	
	@Autowired
	private ProductService products;
	
	@Autowired
	private ProductCategoryService productCategories;
	
	@Autowired
	private UserService users;
	
	@Autowired
	private FileService files;
	
    public static void main(String[] args) {
        SpringApplication.run(CpccApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {

		users.getRepository().save(new User("drakonic59", "Administrateur"));
		productCategories.getRepository().save(new ProductCategory("Livres"));
		files.getRepository().save(new FileEntity("product_1", ".png", Files.readAllBytes(new File("D:\\Bibliothèque\\Projets\\Ramene ta Truffe\\git\\cpcc\\src\\main\\resources\\static\\images\\product_1.png").toPath())));
		
		Product product = new Product( 
				"Truffe Story", 
				"Journal souvenir dédié aux animaux de compagnie. Contient diverses parties pour : les moments de vie de l'animal, les moments forts, les préférences, les notes le concernant, la santé, ses voyages... Le tout décliné dans un format sobre fortement axé Scrapbooking. Le public visé est : les personnes \"gaga\" de leur animal, agés de 25 à 50 ans.", 
				Double.valueOf(1.0), 
				Double.valueOf(21.90), 
				Double.valueOf(10.15), 
				users.getRepository().findById(Long.valueOf(1)).get(),
				productCategories.getRepository().findById(Long.valueOf(1)).get(),
				files.getRepository().findById(Long.valueOf(1)).get(),
				"https://drive.google.com/drive/folders/1vpo5BgvA8z2-EY1hTLsM2XdulNH48kbf",
				Double.valueOf(1.354),
				Double.valueOf(17.8),
				Double.valueOf(35.3),
				Double.valueOf(2.0)
		);
		products.getRepository().save(product);
		
	}
    
}
