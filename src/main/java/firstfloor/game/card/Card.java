package firstfloor.game.card;

/**
 * 각 카드를 지칭하는 인터페이스
 */
public interface Card {
    Shape getShape();
    Number getNumber();

    /**
     * 해당 카드를 모든 플레이어가 볼 수 있는지 공개 여부<br>
     * <br>
     * 보통은 CardSpace에서 공개 비공개를 따지는 게 우선순위지만 카드스페이스에서 공개로 전환한 경우,<br>
     * 일부 카드만 공개되는 카드스페이스 (블랙잭? 등) 의 경우를 상정하여 카드에도 공개 여부를 부착함<br>
     * <br>
     * @return 해당 카드의 공개 여부
     */
    default boolean isOpen() {
        return false;
    }

    /**
     * 카드게임에서 쓰이는 모양은 정해져 있으므로 (♠, ♣, ♥, ◆) 해당 숫자들을 ENUM으로 등록함<br>
     */
    enum Shape {
        SPADE("♠"),
        CLOVER("♣"),
        HEART("♥"),
        DIAMOND("◆");

        private final String displayName;
        public String getDisplayName() {
            return displayName;
        }

        Shape(String displayName) {
            this.displayName = displayName;
        }
    }

    /**
     * 카드게임에서 쓰이는 숫자는 정해져 있으므로 (A~K) 해당 숫자들을 ENUM으로 등록함<br>
     * <br>
     * 숫자간의 비교는 각 게임에서 Comparator&lt;Card.Number&gt;로 비교할 수 있게 함<br>
     */
    enum Number {
        ACE(1, "A"),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11, "J"),
        QUEEN(12, "Q"),
        KING(13, "K");

        private final int number;
        public int getNumber() {
            return number;
        }

        private final String displayName;
        public String getDisplayName() {
            return displayName;
        }

        Number(int number) {
            this(number, Integer.toString(number));
        }
        Number(int number, String displayName) {
            this.number = number;
            this.displayName = displayName;
        }

        /**
         * int 값으로 숫자 ENUM을 불러오는 스태틱 메서드<br>
         * <br>
         * @param number 숫자 int 값
         * @return 숫자 ENUM 값
         */
        public static Number getNumber(int number) throws IllegalArgumentException {
            switch (number) {
                case 1: return ACE;
                case 2: return TWO;
                case 3: return THREE;
                case 4: return FOUR;
                case 5: return FIVE;
                case 6: return SIX;
                case 7: return SEVEN;
                case 8: return EIGHT;
                case 9: return NINE;
                case 10: return TEN;
                case 11: return JACK;
                case 12: return QUEEN;
                case 13: return KING;
                default:
                    throw new IllegalArgumentException("Card number must between 1 and 13!");
            }
        }
    }
}
