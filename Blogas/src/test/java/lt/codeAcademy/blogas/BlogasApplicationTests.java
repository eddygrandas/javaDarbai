package lt.codeAcademy.blogas;

import lt.codeAcademy.blogas.repository.MenuRepository;
import lt.codeAcademy.blogas.model.MenuItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(SpringRunner.class)
@WebMvcTest
public class BlogasApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private MenuRepository menuRepository;

	@Test
	public void findAll() throws Exception {
		// given
		MenuItem stock = new MenuItem();
		stock.setId(1L);
		stock.setName("Pirmas įrašas");
		stock.setDescription("kažkas vyksta");

		List<MenuItem> menuItems = Collections.singletonList(stock);
		given(menuRepository.findAll()).willReturn(menuItems);

		this.mockMvc.perform(get("/api/items"))
				.andExpect(status().isOk())
				.andExpect(content().json("[{'id': 1,'name': 'Pirmas įrašas','description': 'kažkas vyksta','comments':[]}]"));
	}

	@Test
	@WithMockUser(password="{noop}password", value="admin", roles = "ADMIN")
	public void addNewItem() throws Exception {
		this.mockMvc.perform(
				post("/api/add")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"name\":\"test\",\"description\":\"test\"}"))
				.andExpect(content().string("Menu item saved"));
	}
}
