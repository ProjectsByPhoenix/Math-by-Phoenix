
package mathbyphoenix;


public class MathByPhoenix {

    
    public static void main(String[] args) {
        MathLib num = new MathLib();
        
        System.out.println(num.absolute(-3));
        System.out.println(num.log(2));
        System.out.println(Math.ceil(56.695));
        System.out.println(num.der(3,"x*",2));
        System.out.println(num.round(45.36,10000));
    }
    
}
