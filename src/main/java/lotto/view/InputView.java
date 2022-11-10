package lotto.view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class InputView {
    private final String INPUT_PURCHASE_AMOUNT = "구입금액을 입력해 주세요.";
    private final String INPUT_LOTTO_NUMBER = "당첨 번호를 입력해 주세요.";
    private final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";

    private final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void printInputPurchaseAmount() {
        try {
            bw.write(INPUT_PURCHASE_AMOUNT);
            bw.newLine();
        } catch (IOException e) {

        }
    }

    public void printInputPrizeLottoNumber() {
        try {
            bw.write(INPUT_LOTTO_NUMBER);
            bw.newLine();
        } catch (IOException e) {

        }
    }

    public void printInputBonusNumber() {
        try {
            bw.write(INPUT_BONUS_NUMBER);
            bw.newLine();
        } catch (IOException e) {

        }
    }
}