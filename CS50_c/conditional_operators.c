#include <stdio.h>

int main (void) {

    int score = 95;
    printf("What was your test score? ");
    scanf("%d", &score);

    // Comparison operators with conditionals
    if ( score < 60 ){
        printf("You failed the test.\n");
    }
    else if (score > 80 ){
        printf("You passed with distinction.\n");
    }
    else {
        printf("You passed the test.\n");
    }
    return 0;
}


// Quick snatch we do not have or in c we have || and && operators
// Using a single character use single quotes for characters
// Using double characters use double quotes for strings
// == equal to
// != not equal to
// < less than
// > greater than
// <= less than or equal to 
// >= greater than or equal to
// && logical and
// || logical or
// ! logical not
// += addition assignment
// -= subtraction assignment
// *= multiplication assignment
// /= division assignment
// %= modulus assignment
// ++ increment by 1
// -- decrement by 1