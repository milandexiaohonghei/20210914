package paixu;

public class Ascii {
    public static void main(String[] args) {
        String value = "Aaabcss";
        char[] chars = value.toCharArray();
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            int a = (int)chars[i];
            StringBuffer sbu = new StringBuffer();
            String ss = Integer.toBinaryString(a);
            if(ss.length() < 8 ){
                for (int j = 0; j < 8-ss.length(); j++) {
                    sbu.append(0);
                }
            }
            sb.append(sbu.append(ss));
        }
        String cur = sb.toString();
        System.out.println(cur);
        for(int i = 0; i < cur.length() ; i+=3){
            if(i+3 <=  cur.length()){
                String str = cur.substring(i,i+3);
                int sr = Integer.parseInt(str,2);
                System.out.println(sr);
                result.append(value.charAt(sr));
            }
        }
        System.out.println(result.toString());

    }

    public static void main1(String[] args) {
        char i = 'a';
        int a = (int)i;
        String s = a + "";
        //int ss = Integer.parseInt(s,2);
        System.out.println( Integer.parseInt(s));
    }

    public static void main3(String[] args) {
        //String s = "1000";
        //System.out.println( Integer.parseInt(s,2));
        String ss = Integer.toBinaryString(10);
        System.out.println(ss);
    }
}
