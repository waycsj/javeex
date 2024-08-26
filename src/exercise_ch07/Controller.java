package Interface_package;
//클래스
public abstract class Controller {
  //필드
  boolean power;
  //생성자 x
  //메서드
  void show(){
    if(power){
      System.out.println(getName() + "가 켜졌습니다.");
    }else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }
  abstract String getName();
}



class TV extends Controller{
  public TV(boolean power){
    super.power = power;
  }
  @Override
  String getName() {
    return "TV";
  }
}
class Radio extends Controller{
  public Radio(boolean power){
    super.power = power;
  }
  @Override
  String getName() {
    return "Radio";
  }
}