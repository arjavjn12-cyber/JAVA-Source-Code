public class P02_Super {
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
    }  
}
// Now it is printing animal constructor and dog constructor
// even if we didn't call the animal for that

// So here comes the keyword "SUPER", as we saw earlier "this" current object ko represent krta h 
// Same do the SUPER word represent the pparent class

// | Keyword | Meaning       |
// | ------- | ------------- |
// | `this`  | Current class |
// | `super` | Parent class  |

// Three uses of super keyword 
// 1.) Parent constructor call krna (super())
// 2.) Parent method call krna (super.method())
// 3.) Parent variable access krna (super.variable)

// Since there is no visible effect on this code of SUPER keyword because there is 
// only default constructor but when there will be a parametrized then usme code frk pdega