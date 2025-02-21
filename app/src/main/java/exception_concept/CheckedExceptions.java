package exception_concept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lombok.SneakyThrows;

/**
 * Checked exception에 대한 예제를 위해 구현한 클래스 입니다.<br/>
 * <br/>
 * 소스상에서 예외 처리를 강제 합니다.<br/>
 */
public class CheckedExceptions {

  public void trycatchFileNotFoundException() {
    try {
      FileReader reader = new FileReader("none1.exe");
      int c;
      while ((c = reader.read()) != -1) {
        System.out.print((char) c);
      }
      reader.close();
    } catch (FileNotFoundException fe) {
      fe.printStackTrace();
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

  public void eFileNotFoundException() {
    // FileReader reader = new FileReader("none2.exe");
    // int c;
    // while ((c = reader.read()) != -1) {
    // System.out.print((char) c);
    // }
    // reader.close();
  }

  /**
   * checkedException -> runtimeException 으로 변경 합니다.
   */
  @SneakyThrows(IOException.class)
  public void noSearchException(String fileNm) {
    FileReader reader = new FileReader(fileNm);
    int c;
    while ((c = reader.read()) != -1) {
      System.out.print((char) c);
    }
    reader.close();
  }

  public void noSearchException2(String fileNm) throws IOException {
    FileReader reader = new FileReader(fileNm);
    int c;
    while ((c = reader.read()) != -1) {
      System.out.print((char) c);
    }
    reader.close();
  }

  public void noSearchException3(String fileNm) {
    FileReader reader;
    try {
      reader = new FileReader(fileNm);
      int c;
      while ((c = reader.read()) != -1) {
        System.out.print((char) c);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
