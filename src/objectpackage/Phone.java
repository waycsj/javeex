package objectpackage;

 class Phone {
   //필드

   private String model1;
   //매서드
   private int price;

   void print() {
     System.out.println(price + "원의 모델" + model1 + "휴대폰입니다.");
   }

   public String getModel1() {
     return model1;
   }

   public void setModel1(String modelname) {
     model1 = modelname;
   }

   public int getPrice() {
     return price;//이거는 alt+insert키 눌러서 getter기능으롷
   }

   public void setPrice(int price) {
     this.price = price;
   }
 }








