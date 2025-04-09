package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.DSLR;
import com.xworkz.inheritence.internal.Camera;

public class Canon {

    public void capture(Camera camera){

        camera.recordVideo();
        camera.viewGallery();
        camera.capturePhoto();
        camera.changeLens();
        camera.adjustFocus();
        if (camera instanceof DSLR){
            DSLR dslr =(DSLR) camera;
            dslr.delete();
        }
    }
}
