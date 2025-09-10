#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Standardizing the input to lowercase,,,this happens char by char
void toLowerCase(char *str) {
    for (int i =0; str[i]; i++){
        str[i] = tolower(str[i]);
    }
}

int main(){
    char answer[4]; // creates a space of 4 characters to store the input
    printf("Do you want to continue? (yes/no): ");
    scanf("%3s", answer); // Limit input to 3 characters to prevent overflow
    toLowerCase(answer);

    if (strcmp(answer, "yes") == 0) {
        printf("You chose to continue.\n");
    } else if (strcmp(answer, "no") == 0) {
        printf("You chose not to continue.\n");
    } else {
        printf("Invalid input. Please enter 'yes' or 'no'.\n");
    }

    return 0;
}