public class StringBufferEdit{
    public static void main(String[] args){
        appendString();
        insertString();
        deleteString();
        deleteString2();
        cleanString();
        replaceString();
        reverseString();
    }
    
    static void appendString(){
        StringBuffer sb = new StringBuffer();
        sb.append("changefun");
        sb.append(14);
        sb.append('w');
        System.out.println(sb);
    }
    
    static void insertString(){
        StringBuffer sb = new StringBuffer("changefun");
        sb.insert(0, 'C');
        System.out.println(sb);
    }
    
    static void deleteString(){
        StringBuffer sb = new StringBuffer("changefun");
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
    
    static void deleteString2(){
        StringBuffer sb = new StringBuffer("changefun");
        sb.delete(0, 6);
        System.out.println(sb);
    }
    
    static void cleanString(){
        StringBuffer sb = new StringBuffer("changefun");
        sb.delete(0, sb.length());
        System.out.println(sb);
    }
    
    static void replaceString(){
        StringBuffer sb = new StringBuffer("changefun");
        System.out.println(sb.replace(0, 6, "cheng"));
        
    }
    
    static void reverseString(){
        StringBuffer sb = new StringBuffer("changefun");
        System.out.println(sb.reverse());
    }
}
