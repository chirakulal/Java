package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.PDFEditor;

public class FoxitReader implements PDFEditor {

    @Override
    public void openPDF() {
        System.out.println("Running openPDF in FoxitReader");
    }

    @Override
    public void editPDF() {
        System.out.println("Running editPDF in FoxitReader");
    }

    @Override
    public void savePDF() {
        System.out.println("Running savePDF in FoxitReader");
    }

    @Override
    public void sendPDF() {
        System.out.println("Running sendPDF in Foxit");

    }

}
