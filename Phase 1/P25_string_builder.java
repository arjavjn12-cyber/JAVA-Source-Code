public class P25_string_builder {
    public static void main(String[] argss){
        String s = "";
        for(int i=0;i<=5;i++){
            s=s+i;
        }

        StringBuilder sb = new StringBuilder();
        // sb = "tony"; // this will crete error cuzz for adding the anything we need to append it 
        
        sb.append("Hello");
        sb.append(" " + "Tony");
        System.out.println(sb);
    }
}
// so in this code whenever the loop runs it will create a different object 
// Because as string is immutable

// So here comes StringBuilder come in play
// It can be modify
// so what it does here , it will update the stringbuilder 

// funtions which are used 
// sb.length()
// sb.charAt()
// sb.setchartAt(index,'letter we want to place') this used for to change any particular letter
// sb.deletecharAt(index)
// sb.insert(index where we want to add in between, ' lettter')
// sb.reverse() obv for reversing it 
