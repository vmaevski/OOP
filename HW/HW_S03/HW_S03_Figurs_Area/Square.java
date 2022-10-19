public class Square extends Rectangle {

    private double side;
  
    public double getSide() {
      return side;
    }
  
    public void setSide(double side) {
      super.height = side;
      super.width = side;
      this.side = side;
    }
  
    @Override
    public void setWidth(double width) {
      super.setWidth(width);
      super.height = width;
      this.side = width;
    }
  
    @Override
    public void setHeight(double height) {
      super.setHeight(height);
      super.width = height;
      this.side = height;
    }
  
    @Override
    public double getArea() {  
      return super.getArea();
    }
  }
  