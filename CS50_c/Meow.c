#include <stdio.h>
void meow(int n);
int main(){
    printf("How many times do you want me to say Meow? ");
    int n;
    scanf("%d", &n);

    meow(n);
}


void meow(int n){

    for(int i = 0; i < n; i++)
    printf("Meow\n");
}



// Simple say meow 3 times
//int main(){
//    meow(3);
//}
//void meow(int n){
//    for(int i = 0; i < n; i++)
//    printf("Meow\n");
//}

// Another one to print mew 3 times
// int main(){
//    for(int i = 0; i < 3; i++)
//    printf("Meow\n");
//}