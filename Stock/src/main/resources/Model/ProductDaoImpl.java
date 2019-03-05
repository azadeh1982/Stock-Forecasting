package Model;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
public abstract class ProductDaoImpl implements ProductDao{
    @Autowired
	private ModelRepo modelRepo;

	private List<Product> product= Arrays.list
	new Topic(001,"Lamer Creme", "Neiman Marcus", 12),
	new Topic(002, "Lamer Creme", "Saks Fifth Avenu",13),
	new Topic(003, "Lamer Creme", "Nordstrom",14),
	new Topic(004, "Lamer Creme", "Macy's",15),

	}	
		public List<Product> getAllProducts(){
			list<Product>products =new ArrayList<>();
			ModelRepo.findall()
			.forEach(products::add);
			return products;
			
		}
		public Product getProduct(int SKU) {
			return Products.stream().filter(t->t.getSKU().equals(SKU)).findFirst().get();
			
		}
		public void addProduct(Product product) {
			productRepo.save(product);
		}
	public void updateProduct(int SkU, Product product) {
		for (int i=0; Product.ArrayLenght; i++)
			return upadte
	}

	
