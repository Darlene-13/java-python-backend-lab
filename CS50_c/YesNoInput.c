#include <stdio.h>
#include <string.h>
#include <ctype.h>

void toLowerCase(char *str) {
    for (int i =0; str[i]; i++){
        str[i] = tolower(str[i]);
    }
}

int main(){
    char answer[4];
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