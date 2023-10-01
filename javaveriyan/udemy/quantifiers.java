package udemy;

public class quantifiers {
    public static void main(String[] args) {
    //     String str1 ="";
    //     System.out.println(str1.matches(".*"));
    //     System.out.println(str1.matches("[abc]*"))/
                 String str3 ="vegansathya@gmail.com";

                //  System.out.println(str3.matches(".*gmail.*"));
                //   System.out.print(str3.matches("\\w*@gmail(.*)"));
                                // System.out.println(str3.compareTo("gmail"));
                                //   System.out.println(\\".*"gmail.);
        int i = str3.indexOf("@");
        // String uname =str3.substring(0,i);
        String domain =str3.substring(i+1,str3.length());
        // System.out.println("Username"+uname);
        // System.out.println("domainname"+domain);
        // System.out.println(domain.startsWith("gmail"));
        int j=domain.indexOf(".");
        String name  =domain.substring(0, j);
        System.out.println(name.equals("gmail"));

    

    }
}


