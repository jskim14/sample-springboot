package jskim.lines.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import jskim.lines.sample.controller.LottoNumberGenerator;
import jskim.lines.sample.model.Info;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.swing.text.AbstractDocument;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@AutoConfigureMockMvc
@SpringBootTest
class SampleSpringbootApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void test() {

    }
    @Test
    public void 패스워드_변경주기_테스트() throws Exception {

        this.mockMvc
                .perform(get("/password")
                        .param("userId", "admin")
                        .param("password", "123"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userId").value("admin"))
                .andExpect(jsonPath("$.password").value("123"));
    }


    /*
    @DisplayName("로또번호갯수 테스트")
    @Test
    void contextLoads() {
        //given 준비
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        final int price = 1000;

        //when 실행
        final List<Integer> lotto = lottoNumberGenerator.generate(price);
        System.out.println("lotto = " + lotto);

        //then 검증
        assertThat(lotto.size()).isEqualTo(5); //예측된 값
        System.out.println("result = " + assertThat(lotto.size()).isEqualTo(6).toString());
    }

    @DisplayName("mock테스트")
    @Test
    public void testController() throws Exception {
        MultiValueMap<String,String> info = new LinkedMultiValueMap<>();
        info.add("name", "칩");
        info.add("id", "chip");

        //mockMVC에게 컨트롤러에 대한 정보입력
        mockMvc.perform(get("/blog")
                .params(info)) //파라미터 값이 여러개
                .andExpect(status().isOk())
                .andExpect(content().string("칩의 블로그입니다. chip"))
                .andDo(print());
    }

    @Test
    public void testPost() throws Exception {
        String str = objectMapper.writeValueAsString(new Info("데일", "dale"));

        mockMvc.perform(post("/postblog")
                .content(str)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("데일의 블로그입니다. dale"))
                .andDo(print());
    }
     */
}
