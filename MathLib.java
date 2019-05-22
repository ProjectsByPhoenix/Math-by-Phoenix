package mathbyphoenix;

public class MathLib {
    
    public int absolute(int x) {
    int t1 = x*1;
    int t2 = x*-1;
    
    if (t1<0) {
    x*=-1;
    } else {
    x*=1;
    }
        return x;
    }
    public double log(double x) {
    
     x=Math.log(x);
     return x;
    }
    public double round(double x, double y){
       //Okay, so this first part will fix our x so that we round at the desired place value
       double fake_x=x;
       System.out.println(fake_x);
       int counter = 0;
       if (y>=10) {
                while (y>1){
                y/=10;
                counter++;}
                    fake_x=x/Math.pow(10,counter);
                    System.out.println(fake_x);
                        if(fake_x>=5) {Math.ceil(fake_x);} else {Math.floor(fake_x);}
                            fake_x=fake_x*Math.pow(10,counter);
                            System.out.println(fake_x);
                            return fake_x;
       } else if (y<=10) { //This part in case y<1
                while (y<1){
                y*=10;
                counter++;}
                    fake_x=x*Math.pow(10,counter);
                    System.out.println(fake_x);
                        if(fake_x>=5) {Math.ceil(fake_x);} else {Math.floor(fake_x);}
                            fake_x=fake_x/Math.pow(10,counter);
                            System.out.println(fake_x);
                            return fake_x;
                        
       } else { //Standard, making sure to catch the 1's place peeps
          if(x>=5) {return Math.ceil(x);} else {return Math.floor(x);}
           
       } 
    }
//       if (x<0){
//       fake_x*=-1;
//       } else {}
//       //did this in case using negatives
//       if (fake_x<10 && fake_x!=5.0 && fake_x>5){
//       Math.ceil(x);
//       } else if(fake_x<10 && fake_x!=5 && fake_x<5){
//       Math.floor(x);
//       if (fake_x==5){
//       Math.ceil(x);}
//       //okay, let's try to keep this organized, this part is phase one
//       } else if (fake_x>10) {
//       while (fake_x<10){
//       fake_x/=10;}
//       //after this we just repeat the previous proceedure, except this time using fake_x
//       if (fake_x<10 && fake_x!=5.0 && fake_x>5){
//       Math.ceil(x);
//       } else if(fake_x<10 && fake_x!=5 && fake_x<5){
//       Math.floor(x);
//       if (fake_x==5){
//       Math.ceil(x);}}}
       
    
    public String der(int j, String k, int l) {
    String m;
    j=j*l;
    l-=1;
    m=j+k+l;
    return m;
    }

//    @Override
//    public boolean equals(Object o) {
//        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
//        
//        
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

