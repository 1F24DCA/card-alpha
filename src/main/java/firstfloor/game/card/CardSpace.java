package firstfloor.game.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 카드들이 보관되는 공간<br>
 * <br>
 * 카드 패가 될수도 있고, 카드 덱이 될수도 있고, 카드를 버리는 공간이 될 수도 있음<br>
 */
public interface CardSpace {
    /**
     * 카드 공간에 존재하는 카드 리스트를 반환함<br>
     * <br>
     * @return 카드 공간에 존재하는 카드들의 목록
     */
    default List<Card> getCardList() {
        // Unmodifiable List로 넘겨주고, 카드스페이스에서 카드를 꺼내거나 받는 등의 행위는 메서드로 구현할 것
        return Collections.unmodifiableList(new ArrayList<>());
    }


    /**
     * 해당 카드스페이스의 카드들을 모든 플레이어가 볼 수 있는지 공개 여부<br>
     * <br>
     * @return 해당 카드스페이스의 공개 여부
     */
    default boolean isOpen() {
        return false;
    }
}
