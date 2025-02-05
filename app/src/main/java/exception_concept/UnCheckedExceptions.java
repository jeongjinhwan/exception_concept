package exception_concept;

/**
 * Unchecked exceptions에 대한 예제를 위한 구현한 클래스 입니다.<br/>
 * <br/>
 * 예외 발생 시점은 빌드 시점에 확인은 어렵고, <br/>
 * 프로그램 수행 도중 발생 합니다.<br/>
 * <br/>
 * 오류를 내포하고 있는 소스라 보시면 됩니다.<br/>
 */
public class UnCheckedExceptions {

    /**
     * 10 나누기 0
     * @return
     */
  public int eArithmeticException() {
    return 10 / 0;
  }

  /**
   * 없는 배열 호출.
   * @return
   */
  public int eArrayIndexOutOfBoundsException() {
    int[] num = { 1, 2, 3, 4 };
    return num[5];
  }

  /**
   * Unchecked exception을 처리한 경우 
   * @return
   */
  public int trycatchArrayIndexOutOfBoundsException() {
    int i = 0;
    try {
      int[] num = { 1, 2, 3, 4 };
      i = num[5];
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      i = 99;
    }
    return i;
  }

}
