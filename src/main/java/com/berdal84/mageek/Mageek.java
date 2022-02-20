/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

package com.berdal84.mageek;

import net.imagej.Dataset;
import net.imagej.ImageJ;
import net.imagej.ops.OpService;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.img.Img;
import net.imglib2.type.numeric.RealType;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.ui.UIService;
import org.scijava.log.LogLevel;
import org.scijava.log.LogService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Mageek2 is the Java version of Mageek.ijm macro
 * 
 * This plugin allows to process files by selecting a source directory.
 * The process will:
 * - scan recursively the folder
 * - display a scan result to let the user to choose which file extension to process, and which colors to use,
 * - importing each file's series,
 * - splitting each series's channel,
 * - applying a Z projection (to combine all slices),
 * - colorize each channel,
 * - save result to a "ANALYZED" folder.
 */
@Plugin(type = Command.class, menuPath = "Plugins>Mageek")
public class Mageek<T extends RealType<T>> implements Command {


    @Parameter
    private UIService uiService;

    @Parameter
    private OpService opService;
    
    @Parameter
    private LogService logService;

    @Override
    public void run()
    {    	
    	logService.log( LogLevel.INFO, "Running Mageek ...");
    	
    	final String message = "Hello world ! I am Mageek.";
    	uiService.showDialog(message);
    	
    	logService.log( LogLevel.INFO, "Mageek Stopped");
    }

    /**
     * This main function serves for development purposes.
     * It allows you to run the plugin immediately out of
     * your integrated development environment (IDE).
     *
     * @param args whatever, it's ignored
     * @throws Exception
     */
    public static void main(final String... args) throws Exception {
        // create the ImageJ application context with all available services
        final ImageJ ij = new ImageJ();
        ij.ui().showUI();
        ij.command().run(Mageek.class, true);
    }

}
