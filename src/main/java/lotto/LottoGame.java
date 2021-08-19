package lotto;

import lotto.controller.GameController;

public class LottoGame {

    public static void main(String[] args) {

        try {
            new GameController().start();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

}
