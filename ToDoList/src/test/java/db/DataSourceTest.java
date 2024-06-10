package db;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nyr.todo.list.ToDoListService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/root-context.xml"})
public class DataSourceTest {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private ToDoListService toDoListService;
	
	@Test
    public void testDataSource() {
//        System.out.println(dataSource);
		System.out.println(toDoListService);
        // DataSource와 관련된 추가적인 테스트 코드 작성
        System.out.println(1111);
    }
	
}
