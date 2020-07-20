/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import com.hautt.utils.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

//netbean 10 thì xóa 2 cái import, vào thư mục netbeans trong ổ C rồi vào platform\modules\ext xong chọn junit-4.12.jar và hamcrest-core-1.3.jar
/**
 *
 * @author SE130205
 */
public class MathUtilTest {

    @Test
    public void testSuccessfulCases() {
        //đây là hàm dùng để test các đầu vào hợp lệ của hàm cF()
        // ví dụ cF(5) cf(6),... mình sẽ gọi ở đây, coi actual của chúng trả về có khớp với excepted của mình k
        // tuy nhiên mình k chơi trò sout() tự luận kết quả mà để cho ,jar vừa add vào tự luận kết quả so sánh,
        // ròi in ra xanh đỏ cho mình xem
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(720, MathUtil.computeFactorial(6));
        // màu xanh chỉ xảy ra nếu tất cả là màu xanh
        // màu đỏ chỉ xảy ra khi có 1 thằng màu đỏ
        
        // DÙ CODE CÓ ĐỎ HAY XANH DO MÌNH CHƠI KIỂU TEST APP QUA JUNIT, DÙNG BẢNG MÀU
        // THÌ: CLEAN & BUILD LUÔN ĐC CHẠY
        // NHIỆM VỤ GỐC CỦA CLEAN & BUILD: CODE K CÓ ERROR CÚ PHÁP, PHẢI RA .JAR, .WAR
        
        //mình sẽ nâng cấp: code bạn màu đỏ tức là chạy k như kì vọng
        //TỚ DISABLE NÚT CLEAN & BUILD NHEN ĐỂ
        // HOẶC BÀN CODE PHẢI MÀU XANH, HOẶC BẠN XÓA MẸ NÓ MẤY PHẦN TEST ĐI THÌ MỚI RA .JAR, .WAR
        
        //NHỚ 2 CON SỐ ĐẶC BIỆT TRONG CUỘC ĐỜI CỦA BẠN NẾU BẠN XÀI 
        //NETBEAN 8, 1005, máy mình là 1030
        //NETBEAN 10 TRỞ LÊN, 1204
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        // hàm này dùng để test trường hợp đưa data cà chớn
        // ví dụ -5! thì tính thế mẹ nào được
        // k tính được, chứ k trả về -1 nói rằng đầu vào vô lí,
        // vì xét cho cùng -1 đc xem là 1 value
        // tình huống đầu vào cà chớn, ta sẽ tung ra, ném ra ngoại lệ nào đó
        // mà Exception nói chung thì k phải là 1 value
        // nó đại diện cho 1 cái bất thường nào đó
        // mà bất thường thì k thể nào so sánh đc
        // vậy tình huống mà hàm trả về ngoại lệ, k là return, nên k xài đc
        // hàm asserEquals() vì hàm này so sánh 2 values
        // do đó ta xài chiêu khác, ta chỉ hứng ngoại lệ, coi nó có đúng ngoại lệ đó hem
        
        MathUtil.computeFactorial(-5);
    }

}
