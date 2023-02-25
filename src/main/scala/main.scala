package com.skdziwak.mandelbrot

import gui.MandelbrotGui

import java.awt.Color
import javax.imageio.ImageIO
import javax.swing.{UIManager, UnsupportedLookAndFeelException}

@main
def main(): Unit = {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel")
    } catch {
        case e: UnsupportedLookAndFeelException => e.printStackTrace()
        case e: ClassNotFoundException => e.printStackTrace()
        case e: InstantiationException => e.printStackTrace()
        case e: IllegalAccessException => e.printStackTrace()
    }
    val gui = new MandelbrotGui
    gui.show()
//    val template = (MandelbrotTemplate.Default
//        color colors
//        size 1024
//        maxIterations 1000
//        goTo(0, 512)
//        zoom 1.5
//        goTo(712, 455)
//        zoom 8
//        goTo(645, 93)
//        zoom 80
//        size 4096
//        goTo(1859, 1643)
//        zoom 80
//        xSize 1920
//        ySize 1024
//        goTo(764, 239)
//        zoom 80
//        goTo (730, 723)
//        zoom 120
//        goTo(1115, 818)
//        zoom 120
//        )
//    val exporter = MandelbrotExport("output/render.mp4", 1920, 1024, colors)
//    ZoomAnimation.animate(0.5, template, exporter, 1.04)
//    exporter.close()
}