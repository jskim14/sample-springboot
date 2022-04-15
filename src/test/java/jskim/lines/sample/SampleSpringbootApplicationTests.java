package jskim.lines.sample;

import jskim.lines.sample.controller.LottoNumberGenerator;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SampleSpringbootApplicationTests {

//    @Autowired
//    private MockMvc mockMvc;

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

}
