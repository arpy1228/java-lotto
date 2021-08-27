package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class WinningLottoNumberTest {

    @DisplayName("로또 당첨 번호 개수 에외 테스트")
    @Test
    public void lottoWinningNumberExceptionTest() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new WinningLottoNumber("0,1,2,3,4"))
                .withMessageMatching("숫자는 총 6개여야 합니다.");
    }

    @DisplayName("로또 당첨 번호 범위 에외 테스트")
    @Test
    public void lottoWinningNumberBoundExceptionTest() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new WinningLottoNumber("0,1,2,3,4,5"))
                .withMessageMatching("숫자는 1이상 45이하여야 합니다.");
    }

    @DisplayName("로또 당첨 번호 중복 에외 테스트")
    @Test
    public void lottoWinningNumberDuplicateTest() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new WinningLottoNumber("1,1,2,3,4,5"))
                .withMessageMatching("중복된 번호가 존재합니다.");
    }

}