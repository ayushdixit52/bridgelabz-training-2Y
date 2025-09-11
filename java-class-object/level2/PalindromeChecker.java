public class PalindromeChecker {
    private String text;
    public PalindromeChecker(String t){text=t;}
    public boolean isPalindrome(){
        String s=text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static void main(String[] args){
        PalindromeChecker p=new PalindromeChecker("Madam");
        System.out.println(p.isPalindrome()?"Palindrome":"Not Palindrome");
    }
}
