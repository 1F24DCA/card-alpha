package firstfloor.game.multiplay;

public interface Client {
    /**
     * 서버측에 command를 실행함<br>
     * <br>
     * @param command 서버측에 실행할 커맨드
     * @return 서버측이 반환한 결과
     */
    String execute(String command);
}
