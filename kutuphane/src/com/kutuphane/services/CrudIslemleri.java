package com.kutuphane.services;

import java.util.List;
//interface
public interface CrudIslemleri<T> {
    void ekle(T t) throws Exception;
    List<T> listele() throws Exception;
    T ara(int id) throws Exception;
    void guncelle(T t) throws Exception;
    void sil(int id) throws Exception;
}
