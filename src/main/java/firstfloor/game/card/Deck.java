package firstfloor.game.card;

/**
 * 카드 덱을 나타내는 클래스<br>
 * <br>
 * 카드 덱을 초기화하거나 뽑는 등의 내용을 다룸<br>
 */
abstract public class Deck implements CardSpace {
    public Deck() {
        // 덱이 생성되면 보편적으로 초기화시켜줌
        initialize();
    }

    /**
     * 덱을 초기화하는 메서드<br>
     */
    protected void initialize() {
        // 보편적으로 덱은 카드를 채우고 셔플시킴
        fill();
        shuffle();
    }

    /**
     * 카드를 (보편적으로 52장 1벌) 채워넣는 메서드<br>
     */
    abstract protected void fill();

    /**
     * 덱을 섞는 메서드<br>
     */
    abstract protected void shuffle();

    /**
     * 덱의 카드를 뽑는 메서드<br>
     * <br>
     * @return 뽑아서 나온 카드
     */
    abstract public Card draw();
}
