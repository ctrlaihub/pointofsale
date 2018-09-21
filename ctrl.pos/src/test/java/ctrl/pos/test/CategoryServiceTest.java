package ctrl.pos.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ctrl.cfg.Application;
import com.ctrl.domains.stock.Category;
import com.ctrl.service.CategoryService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
public class CategoryServiceTest {

	@Autowired
	private CategoryService categoryService;
	
	@Test
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
}
