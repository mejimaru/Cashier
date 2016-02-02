package com.getkeepsafe.cashier;

import android.support.annotation.NonNull;

public interface PurchaseListener {
    void success(@NonNull Purchase purchase);
    void failure(@NonNull Product product, final int code);
}
