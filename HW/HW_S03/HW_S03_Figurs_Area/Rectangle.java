public class Rectangle extends Figure {

    protected double width;
    protected double height;
  
    public double getHeight() {
      return height;
    }
  
    public double getWidth() {
      return width;
    }
  
    public void setHeight(double height) {
      this.height = height;
    }
  
    public void setWidth(double width) {
      this.width = width;
    }
  
    @Override
    public double getArea() {  
      return width * height;
    }
  }
  