package com.zxn.keyboard.action;

import android.text.Editable;

/**
 * Listener
 * 说明：键盘输入监听
 */
public interface KeyBoardActionListener {

    /**
     * 计算监听.Result
     *
     * @param result 计算结果
     */
    void onArithmetic(String result);

    void onCustomKeyClick(); //自定义特殊按键,银行卡按键.

    void onComplete(); //完成点击,收款按钮点击.

    void onTextChange(Editable editable); //文本改变

    void onClear(); //正在删除

//    @Deprecated
//    void onClearAll(); //全部清除
}
