/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hautt.utils;

/**
 *
 * @author SE130205
 */
//class này chứa những hàm toán học tính toán gì đó để giúp cho mọi nơi khác, phàm cái gì mang tính chất xài chung cho mọi nơi thì ta sẽ dùng kỹ thuật
//STATIC
public class MathUtil {

    // tính n! -> tăng kết quả rất nhanh, sẽ tràn kiểu int sớm, do int chỉ tối đa 2tỉ 1, do đó xài long an toàn hơn
    // tuy thế 15! đã là to lắm, mình hạn chế chỉ tính 15! đổ lại
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
