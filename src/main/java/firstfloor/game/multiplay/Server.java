package firstfloor.game.multiplay;

public interface Server {
    /**
     * (클라이언트에서 받아옴) command를 실행함<br>
     * <br>
     * @param command (클라이언트에서 받아온) 커맨드
     * @return (클라이언트에 내보낼) 결과
     */
    String execute(String command);
}
