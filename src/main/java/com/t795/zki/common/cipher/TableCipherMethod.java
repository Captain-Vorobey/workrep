package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.BlockMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class TableCipherMethod implements ICipher {

    TableCipherMethod(String message, int value){};

    public StreamMessage  encryptor() {
        return null;
    }

    public StreamMessage  decryptor() {
        return null;
    }

    private void ChangeInstanse(int value) {

    }

    private int rolling(int value, int index) {

        return value;
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    public StreamMessage getKey() {
        return null;
    }

    public BlockMessage getMessage() {
        return null;
    }
}