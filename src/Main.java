
class DemoApplication {
    public static void main(String[] args) {
String str ="1234";
    System.out.println(reverse(str));}
    public static String reverse (String in){
        if (in ==null)
            throw new IllegalArgumentException("Input is empty");
       StringBuilder stringBuilder = new StringBuilder();
       char[] chars = in.toCharArray();
       for(int i = chars.length-1;i>=0;i--){
           stringBuilder.append(chars[i]);
       }
           return stringBuilder.toString();

    }
}