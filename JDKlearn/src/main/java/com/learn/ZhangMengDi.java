package com.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.jmatio.io.MatFileReader;
import com.jmatio.types.MLArray;
import com.jmatio.types.MLInt16;

import mil.nga.tiff.FileDirectory;
import mil.nga.tiff.Rasters;
import mil.nga.tiff.TIFFImage;
import mil.nga.tiff.TiffWriter;
import mil.nga.tiff.util.TiffConstants;

/**
 * Created by teemper on 2018/4/3, 22:25.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ZhangMengDi {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("world");


        MatFileReader read = new MatFileReader("C:\\Users\\w\\Desktop\\00-00-00.mat");
        MLArray mlArray=read.getMLArray("box");//mat存储的就是img矩阵变量的内容
        MLInt16 d=(MLInt16)mlArray;
        short[][] matrix=(d.getArray());//只有jmatio v0.2版本中才有d.getArray方法


//		 System.out.println(d);
//		 System.out.println(matrix);
//		 for (int i = 0; i < matrix[1231].length; i++) {
//			 if(matrix[1231][i] != 0)System.out.println(matrix[1231][i]);
//		}
//

        int width = matrix.length;
        int height = matrix[0].length;
        int samplesPerPixel = 1;
        int bitsPerSample = 32;

        Rasters rasters = new Rasters(width, height, samplesPerPixel, bitsPerSample);

        int rowsPerStrip = rasters.calculateRowsPerStrip(TiffConstants.PLANAR_CONFIGURATION_CHUNKY);

        FileDirectory directory = new FileDirectory();
        directory.setImageWidth(width);
        directory.setImageHeight(height);
        directory.setBitsPerSample(bitsPerSample);
        directory.setCompression(TiffConstants.COMPRESSION_NO);
        directory.setPhotometricInterpretation(TiffConstants.PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO);
        directory.setSamplesPerPixel(samplesPerPixel);
        directory.setRowsPerStrip(rowsPerStrip);
        directory.setPlanarConfiguration(TiffConstants.PLANAR_CONFIGURATION_CHUNKY);
        directory.setSampleFormat(TiffConstants.SAMPLE_FORMAT_FLOAT);
        directory.setWriteRasters(rasters);


        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                float pixelValue = matrix[x][y];
                rasters.setFirstPixelSample(x, y, pixelValue);
            }
        }

        TIFFImage tiffImage = new TIFFImage();
        tiffImage.add(directory);
        byte[] bytes = TiffWriter.writeTiffToBytes(tiffImage);
        // or
        File file = new File("C:\\Users\\w\\Desktop\\temp.tiff");
        TiffWriter.writeTiff(file, tiffImage);

    }
}
