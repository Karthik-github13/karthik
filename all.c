#include<stdio.h>
#include<string.h>
int main() {
char str[]= "Hello world", and[20],or[20],xor[20];
int i;
printf("The given plain text is: %s",str);
printf("After performing AND operation the cipher text is: \n");
for(i=0;i<strlen(str);i++) {
and[i]=str[i]&127;
printf("%c\n",and[i]);
}
printf("After performing OR operation the cipher text is: \n");
for(i=0;i<strlen(str);i++) {
or[i]=str[i]|127;
printf("%c\n",or[i]);
}
printf("After performing xor operation the cipher text is: \n");
for(i=0;i<strlen(str);i++) {
xor[i]=str[i]^127;
printf("%c\n",xor[i]);
}

}
