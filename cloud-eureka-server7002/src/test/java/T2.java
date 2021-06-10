import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/1 23:39<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class T2 {
    @Test
    public void test1(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
