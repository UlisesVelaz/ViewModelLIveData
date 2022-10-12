package com.androiddesdecero.viewmodellivedata.viewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by ulisesvelázquez on 11/oct/22
 */
public class SumarViewModel extends ViewModel {

    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
