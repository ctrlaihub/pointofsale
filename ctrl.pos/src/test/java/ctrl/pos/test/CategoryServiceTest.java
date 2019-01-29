package ctrl.pos.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ctrl.cfg.Application;
import com.ctrl.domains.stock.Category;
import com.ctrl.service.CategoryService;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
public class CategoryServiceTest {

	@Autowired
	private CategoryService categoryService;
	
	@Test
//	@Ignore
	public void listCategories(){
		
		Category c=new Category();
		c.setActive(true);
		c.setName("rice");
		
		Category c1=new Category();
		c1.setActive(true);
		c1.setName("biscuit");
		
//		Category c2=new Category();
//		c2.setActive(false);
//		c2.setName("chocolate");
		
		categoryService.addCategory(c);
		categoryService.addCategory(c1);
//		categoryService.addCategory(c2);
		
		List<Category> l=new ArrayList<>();
		categoryService.listAllCategory().forEach(l::add);
		System.out.println(l);
		
//		assertEquals("success", 2, categoryService.listAllCategory().size());
		
		/*assertEquals(true, categoryService.deleteCategory(c));
		*/
		List<Category> l1=new ArrayList<>();
		categoryService.listAllCategory().forEach(l1::add);
		System.out.println(l1);

	}
	
	@Test
	@Ignore
	public void CategoryTest(){
		
		Category ca=addDetails();
		assertEquals("success", true, categoryService.addCategory(ca));
	}
	
	public Category addDetails(){
		Category c=new Category();
		c.setName("biscuits");
		c.setActive(true);
		return c;
	}
	
	@Test
	@Ignore
	public void getById(){
		
		assertEquals("success", 1, categoryService.getById(1));

	}
}
