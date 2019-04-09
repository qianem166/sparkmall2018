package com.atguigu.sparkmall2018.mock.util

import java.util.Random

import scala.collection.mutable

object RandomNum {
    def apply(fromNum:Int,toNum:Int): Int =  {
        fromNum+ new Random().nextInt(toNum-fromNum+1)
    }
    def multi(fromNum:Int,toNum:Int,amount:Int,delimiter:String,canRepeat:Boolean) ={
        // 实现方法  在fromNum和 toNum之间的 多个数组拼接的字符串 共amount个用delimiter分割  canRepeat为false则不允许重复
        if (canRepeat) {
            (1 to amount).toList.map(_ => apply(fromNum, toNum)).toString()
        } else {
            val set = mutable.Set[Int]()
            while (set.size < amount) {
                set += apply(fromNum, toNum)
            }
            set.toList.toString()
        }
    }
}

