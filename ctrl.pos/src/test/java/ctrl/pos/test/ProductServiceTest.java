package ctrl.pos.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ctrl.cfg.Application;
import com.ctrl.domains.stock.Category;
import com.ctrl.domains.stock.Product;
import com.ctrl.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
public class ProductServiceTest {

	@Autowired
	private ProductService productService;
	
	@Test
	public void testProduct(){
		
		///////////////////////////
		Product p=new Product();
		p.setActive(true);
		p.setExpiryDate(new Date());
		p.setName("kitkat");
		p.setPrice(10.00);
		p.setProductCode("KIT100");
		p.setQuantity(100);
		p.setSellingprice(12.00);
		
		Category c=new Category();
		c.setActive(true);
		c.setName("softdrink");
		
		p.setCategory(c);
		
		////////////////////////////////
		Product p1=new Product();
		p1.setActive(false);
		p1.setExpiryDate(new Date());
		p1.setName("coke");
		p1.setPrice(10.00);
		p1.setProductCode("COKE100");
		p1.setQuantity(100);
		p1.setSellingprice(12.00);
		
		Category c1=new Category();
		c1.setActive(true);
		c1.setName("softdrink");
		
		p1.setCategory(c);
		
		productService.createProduct(p);
		productService.createProduct(p1);
		
		
		List<Product> l=new ArrayList<>();
		productService.listAllProducts().forEach(l::add);
		System.out.println(l);
		
//		assertEquals(2, productService.listAllProducts().size());
//		assertEquals(1, productService.listAllActiveProducts().size());
//		assertEquals(2, productService.listProductByCategory().size());
		
	}
}
