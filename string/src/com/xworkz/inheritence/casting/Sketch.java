package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.PaintBrush;
import com.xworkz.inheritence.internal.Drawing;

public class Sketch {

    public void draw(Drawing drawing){

        drawing.colourFull();
        drawing.dry();
        drawing.use();
        drawing.dipInPaint();
        drawing.clean();
        if(drawing instanceof PaintBrush){
            PaintBrush paintBrush = (PaintBrush) drawing;
            paintBrush.mixColor();
        }

    }
}
