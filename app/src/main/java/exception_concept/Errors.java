package exception_concept;

/**
 * Error 에 대한 예제를 위한 구현한 클래스 입니다.<br/>
 * <br/>
 * 일반적으로는 알 수 없는 시스템 상의 오류,<br/>
 * Unchecked exception과 비슷해 보이지만, 프로그램 오류 보단, 시스템 상의 오류가 지배적이다.<br/>
 */
public class Errors {
    /**
     * 메모리 초과. OutOfMemoryError
     * @return
     */
    public long[] eOutOfMemoryError() {
        long[] arr = new long[Integer.MAX_VALUE]; // 매우 큰 배열 생성 시도
        return arr;
    }
}
