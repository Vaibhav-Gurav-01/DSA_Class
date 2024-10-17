package Stack_Examples;

import java.util.Scanner;

public class String_Reversal
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        stack_char_class obj = new stack_char_class();//object created
        System.out.println("Enter word");
        String word=in.next();//read word from user
        obj.create_Stack(word.length());
        for(int i=0;i<word.length();i++)//character by charater copy element to stack till all characters are over
            obj.push(word.charAt(i));
        String r_word="";
        while(obj.is_Empty()!=true)//pop and copy each poped element to reverse string till stack over
            r_word+=obj.pop();

        System.out.println("Reverse is:"+r_word);//print reverse string
    }
}
