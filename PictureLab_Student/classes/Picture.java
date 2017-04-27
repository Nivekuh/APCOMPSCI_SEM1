import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
		pixelObj.setGreen(0);
      }
    }
  }
  
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
		pixelObj.setGreen(255 - pixelObj.getGreen());
		pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  
  public void grayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
		int val = (int)pixelObj.getAverage();
        pixelObj.setRed(val);
		pixelObj.setGreen(val);
		pixelObj.setBlue(val);
      }
    }
  }
  
  public int[] avgColor(){
	Pixel[][] pixels = this.getPixels2D();
	int[] avg = new int[3];
	for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
		avg[0] += pixelObj.getRed();
		avg[1] += pixelObj.getGreen();
		avg[2] += pixelObj.getBlue();
      }
    }
	
	for (int i = 0; i < 3; i++)
		avg[i] /= (this.getWidth() * this.getHeight());
	
	return avg;
  }
  
  public void setContrast(double contrast)
  {
    Pixel[][] pixels = this.getPixels2D();
	int[] avg = this.avgColor();
	
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
		pixelObj.setRed((int)(contrast*(pixelObj.getRed() - avg[0]) + pixelObj.getRed()));
		pixelObj.setGreen((int)(contrast*(pixelObj.getGreen() - avg[1]) + pixelObj.getGreen()));
		pixelObj.setBlue((int)(contrast*(pixelObj.getBlue() - avg[2]) + pixelObj.getBlue()));
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
	int s = Math.min(pixels.length, width);
    for (int row = 0; row < s; row++)
    {
      for (int col = 0; col < row; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[col][row];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void vMirrorRect(int mirrorPoint, int[] coord1, int[] coord2){ //Rectangle coordinates, inclusive
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = Math.min(coord1[1], coord2[1]); row <= Math.max(coord1[1], coord2[1]); row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = Math.min(coord1[0], coord2[0]); col <= Math.max(coord1[0], coord2[0]); col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
	
	System.out.println(count);
  }
  
  public void hMirrorRect(int mirrorPoint, int[] coord1, int[] coord2){ //Rectangle coordinates, inclusive
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = Math.min(coord1[1], coord2[1]); row <= Math.max(coord1[1], coord2[1]); row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = Math.min(coord1[0], coord2[0]); col <= Math.max(coord1[0], coord2[0]); col++)
      {
        count++;
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint]                       
                         [col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
	
	System.out.println(count);
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
	this.vMirrorRect(276, new int[]{13, 27}, new int[]{275, 96});
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copySection(Picture fromPic, int[] fCoord1, int[] fCoord2,
                 int startRow, int startCol)
  {
    Color fromColor = null;
    Color toColor = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = Math.min(fCoord1[1], fCoord2[1]), toRow = startRow; 
         fromRow < Math.max(fCoord1[1], fCoord2[1]) &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = Math.min(fCoord1[0], fCoord2[0]), toCol = startCol; 
           fromCol < Math.max(fCoord1[0], fCoord2[0]) &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromColor = fromPixels[fromRow][fromCol].getColor();
        toColor = toPixels[toRow][toCol].getColor();
		Pixel toPixel = toPixels[toRow][toCol];
		Color color = new Color(fromColor.getRed()*fromColor.getAlpha()/255 + (255 - fromColor.getAlpha())/255*toColor.getRed()*toColor.getAlpha(),
								fromColor.getGreen()*fromColor.getAlpha()/255 + (255 - fromColor.getAlpha())/255*toColor.getGreen()*toColor.getAlpha(),
								fromColor.getBlue()*fromColor.getAlpha()/255 + (255 - fromColor.getAlpha())/255*toColor.getBlue()*toColor.getAlpha());
        toPixel.setColor(color);
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
	Picture mark = new Picture("blue-mark.jpg");
	Picture cMark = mark.crop(new int[]{236, 156}, new int[]{464, 358});
	this.setAsBackForPicture(cMark, new int[]{130, 208}, new Color(6, 42, 76), 50);
	Picture fml = new Picture("fml.jpg").scale(.25, .25);
	this.setAsBackForPicture(fml, new int[]{100, 0}, new Color(150, 160, 160), 80);
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
	Pixel bottomPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
	Color bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
		bottomPixel = pixels[row+1][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
		bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist || leftPixel.colorDistance(bottomColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist){
	this.setContrast(10000*edgeDist);
  }
  
  public void setAsBackForPicture(Picture front, int[]coords, Color color, int tolerance){
    Pixel[][] fPixels = front.getPixels2D();
	Pixel[][] bPixels = this.getPixels2D();
    for (int row = 0; row < fPixels.length; row++)
    {
      for (int col = 0; col < fPixels[0].length; col++)
      {
		Pixel fPixel = fPixels[row][col];
		Pixel bPixel = bPixels[coords[1]+row][coords[0]+col];
        if (fPixel.colorDistance(color) > tolerance){
           bPixel.setColor(fPixel.getColor());
		}
      }
    }
  }
  
  public Picture crop(int[]coord1, int[]coord2){
	  Picture pic = new Picture(Math.abs(coord2[1] - coord1[1]), Math.abs(coord2[0] - coord1[0]));
	  pic.copySection(this, coord1, coord2, 0, 0);
	  
	  return pic;
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
