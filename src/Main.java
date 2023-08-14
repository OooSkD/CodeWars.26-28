import task26.RomanNumerals;
import task27.LongestConsec;

public class Main {
    public static void main(String[] args) {
        System.out.println(RomanNumerals.toRoman(1000) );
        System.out.println(RomanNumerals.fromRoman("M"));
        //"wlwsasphmxxowiaxujylentrklctozmymu"
        System.out.println(LongestConsec.longestConsec(
                new String[]{"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"},2));
    }
}
