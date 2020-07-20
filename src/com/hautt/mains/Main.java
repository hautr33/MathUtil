/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hautt.mains;

import static com.hautt.utils.MathUtil.computeFactorial;

/**
 *
 * @author SE130205
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Result:");
        System.out.println("5! = " + computeFactorial(5));
        //đoạn trên chính là test hàm bằng tay, manual test, tức là:
        //ta chuẩn bị data để test, chính là số 5,
        //đầu vào ta cọi hàm computeFactorial(5), ta chạy hàm, ta xem nó in ra số mấy (actual value)
        //trước đó, ta phải tự tính bằng tay 5!, cái ta kì vọng hàm phải trả về con số này,
        //120 là cái ta hi vọng hàm sẽ trả về cho 5!
        //              gọi là excepted value
        //hàm chạy xong ta so sánh kq giữa excepted và actual
        // nếu khớp nhau thì hàm xử lý đúng, vì xử lý đúng mới ra những cái mình mong,
        // nếu k khớp, thì hoặc hàm sai, hoặc mình kì vọng sai
        
        // làm bằng tay thì ta phải so sánh bằng mắt: excepted vs actual,
        // để luận kết quả đúng sai của hàm
        
        
        //excepted: chửi cà chớn
        //excepted: m đưa đầu vào cà chớn, bố chửi m bằng việc ném ra ngoại lệ
        //Exception, vì éo tính được do đầu vào cà chớn
        System.out.println("-5! = " + computeFactorial(-5));
        
        
        
        //  nhìn bằng mắt để nhìn kết quả: ổn, nhưng chưa hay
        // giang hồ có hộ trợ thêm các bộ thư viện 
        // giúp ta test hàm ta viết 1 cách hiệu quả hơn qua hiệu hứng màu sắc,
        // và chúng tự so sánh giùm ta ta k cần sout() nhìn kq, so sánh bằng mắt với kì vọng
        // tool này sẽ so giùm ta báo ta 2 trạnng thái duy nhất
        // màu xanh: code chạy actual khớp với excepted
        // màu đỏ: toang, actual k khớp với excepted
        
        
        //thư viện này mang thên chung: Unit Testing
        // tên riêng: JUnit, TestNG, xUnit, MSTest, NUnit, PHPUnit, CppUnit
    }

}
