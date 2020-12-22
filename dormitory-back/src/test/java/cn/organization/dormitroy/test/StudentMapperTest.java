package cn.organization.dormitroy.test;

import cn.organization.dormitory.BackSystemApplication;
import com.google.common.io.ByteStreams;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Allen on 2020/12/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackSystemApplication.class)
public class StudentMapperTest {


  public String readJsonFile(String fileName) {
    byte[] bytes = null;
    try {
      InputStream inputStream = Files.newInputStream(Paths.get("src/test/resources/" + fileName));
     bytes = ByteStreams.toByteArray(inputStream);
    } catch (Exception e) {

    }
    if (bytes != null) {
      return new String(bytes);
    }
    return null;
  }
}
