//#include <stdio.h>

//int main(void) {
    //char name[100];
   // printf("What is your name? ");

   // scanf("%99s", name); // Limit input to avoid buffer overflow

    //printf("Hello, %s!\n", name);
   // return 0;
//}


//  Alternative using fgets to get the full name with spaces

#include <stdio.h>

int main(void){

    char name[100];
    printf("What is your name? ");

    if (fgets(name, sizeof(name), stdin) !=NULL){
        printf("Hello, %s!", name);
    }

}