package com.xworkz.interfaces.internal;

public interface PDFEditor {

    void openPDF();
    void editPDF();
    void savePDF();
    default void sendPDF(){
        System.out.println("Running sendPDF in PDFEditor");
    }
}
