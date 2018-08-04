import java.util.Scanner;
public class StringGameForWorksheetBELL{ 
    public static void main(String[] args){
        String word;
        int start=0;
        int end=0;
        String stop="no";
        Scanner in = new Scanner(System.in);
        
        ////////////////////////////////////////////////////
        do{
        System.out.println("What is your String to run length on?");
        word=in.nextLine();
        System.out.println("word = "+word);
        System.out.println(word+".length(); ="+word.length());
        System.out.println("type     yes     if you would like to run this again");
        stop=in.nextLine();
        }while(stop.equals("yes"));
        stop="no";
        
        /////////////////////////////////////////////////////
        //replace
        char old='x';
        char newOne='x';
        do{
        System.out.println("What is your String to run replace?");
        word=in.nextLine();
        System.out.println("What is your char you want to replace?");
        old=in.nextLine().charAt(0);
        System.out.println("What is the new char you want?");
        newOne=in.nextLine().charAt(0);
        System.out.println("word = "+word);
        System.out.println("old = "+old);
        System.out.println("newOne = "+newOne);
        System.out.println(word+".replace("+old+","+newOne+"); ="+word.replace(old,newOne));
        System.out.println("type     yes     if you would like to run this again");
        stop=in.nextLine();
        }while(stop.equals("yes"));
        stop="no";
        /////////////////////////////////////////////////////
        do{//substring(x,y)
        System.out.println("What is your String for substring method?");
        word=in.nextLine();
        System.out.println("What is your starting position?");
        start=in.nextInt();
        in.nextLine();
        System.out.println("What is your ending position?");
        end=in.nextInt();
        in.nextLine();
        System.out.println("word = "+word);
        System.out.println("start = "+start);
        System.out.println("end = "+end);
        System.out.println(word+".substring("+start+","+end+"); ="+word.substring(start,end));
        System.out.println("type     yes     if you would like to run this again");
        stop=in.nextLine();
        }while(stop.equals("yes"));
        stop="no";
        
        /////////////////////////////////////////////////////
        //charat
        do{
        System.out.println("What is your String to run charAt?");
        word=in.nextLine();
        System.out.println("What is your position?");
        start=in.nextInt();
        in.nextLine();
        System.out.println("word = "+word);
        System.out.println("start = "+start);
        System.out.println(word+".charAt("+start+"); ="+word.charAt(start));
        System.out.println("type     yes     if you would like to run this again");
        stop=in.nextLine();
        }while(stop.equals("yes"));
        stop="no";
        
        /////////////////////////////////////////////////////
        //charat
        String secondWord="broken";
        do{
        System.out.println("What is your String to run concat on?");
        word=in.nextLine();
        System.out.println("What is the String you want to add on?");
        secondWord=in.nextLine();
        System.out.println("word = "+word);
        System.out.println("secondWord = "+secondWord);
        System.out.println(word+".concat("+secondWord+"); ="+word.concat(secondWord));
        System.out.println("type     yes     if you would like to run this again");
        stop=in.nextLine();
        }while(stop.equals("yes"));
        stop="no";
   
    }
 }