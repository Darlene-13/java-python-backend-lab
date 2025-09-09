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