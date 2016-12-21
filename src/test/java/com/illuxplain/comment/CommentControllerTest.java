package com.illuxplain.comment;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.illuxplain.models.Comments;
import com.illuxplain.repository.MySqlCommentPresistence;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestContext.class } )
@WebAppConfiguration
public class CommentControllerTest extends TestCase {

	@Mock
	MySqlCommentPresistence<Comments> presistence;
	
	private MockMvc mockMvc;
	
	  @Autowired
	  private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

	}

	@Test
	public void testGetCommentsListFromRepositoryShouldHaveCommentObject()
			throws Exception {
		Mockito.when(presistence.save("", new Object[] { "", "", "" }))
				.thenReturn(true);

		mockMvc.perform(post("/add-comment")).andExpect(status().isOk());
	}

}
