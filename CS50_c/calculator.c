#include <stdio.h>

int main(void) {
    int a, b;
    char op;

    printf("Enter an expression (eg. 3 + 4 or 5*6): ");
    if (scanf("%d %c %d", &a, &op, &b));
    {
        switch (op) {
            case '+':
                printf("%d %c %d = %d\n", a, op, b, a + b);
                break;
            case '-':
                printf("%d %c %d = %d\n", a, op, b, a - b);
                break;
            case '*':
                printf("%d %c %d = %d\n", a, op, b, a * b);
                break;
            case '/':
                if (b != 0) {
                    printf("%d %c %d = %.2f\n", a, op, b, (float)a / b);
                } else {
                    printf("Error: Division by zero is undefined.\n");
                }
                break;
            default:
                printf("Error: Unsupported operator '%c'. Use +, -, *, or /.\n", op);
                break;
        }
    }
}