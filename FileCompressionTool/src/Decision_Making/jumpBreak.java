// java supports three types of jump statement; break, continue, return.
// These three statements transfer control to another part of the program
// Break: Majorly used for terminating a sequence, mostly in switch, to exit a loop, civilized form of goto.
// Continue: Sometimes usedful to forcce early iteration of the loop, that is one might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration.


import java.util.*;

class jumpBreak{
    public static void main(String[] args){
        for (int i = 0; i< 10; i++){
            // if the number is even skip and continue
            if( i % 2 == 0)
                continue;
            // if the number is off print it
            System.out.println(i + " ");
        }
    }
}