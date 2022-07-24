package firstfloor.game.card;

/**
 * 카드패를 나타내는 클래스<br>
 * <br>
 * 카드를 가져오거나 내보내는 등의 내용을 다룸<br>
 * 어떤 카드를 뽑고 내는지에 대한 내용들은 모두 게임 컨트롤러가 결정함<br>
 */
abstract public class Hand implements CardSpace {
    /**
     * 카드를 가져오는 메서드<br>
     * 어떤 카드를 가져오는지는 게임 컨트롤러가 결정함 (상대방의 패에서 가져오냐, 덱에서 가져오냐 등)<br>
     * <br>
     * @param card 가져와서 패에 넣을 카드
     */
    abstract public void draw(Card card);

    /**
     * 카드를 내는 메서드<br>
     * 게임에 따라 중복되는 카드가 있을 수도 있으므로, Card 객체 대신 cardIdx를 받아오도록 함<br>
     * <br>
     * @param cardIdx 카드패 중 낼 카드의 cardIdx
     */
    abstract public void release(int cardIdx);
}
