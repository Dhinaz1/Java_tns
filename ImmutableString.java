class ImmutableString {
    public static void main(String args[]) {
        String s1 = "Dhina";
        String s2 = s1;
        System.out.println(s1 == s2);
        s1 += "jaimah";// s1=s1+jaimah
        System.out.println(s1 == s2);
        System.out.println(s1);
    }
}