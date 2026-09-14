public class P04_super_variable {
    public static void main(String[] args){
        Dog d = new Dog();
        System.out.println(d.name); // now this will only print dog name cuzz it gets override
        d.display(); // we can check super is added there fo it will print both 
    }    
}
