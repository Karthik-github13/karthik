#include<stdio.h>
#include<string.h>
int main() {
char str1[]= "hello world", str2[20];
int i;
for(i=0;i<strlen(str1);i++) {
str2[i]=str1[i]^0;
printf("%c\n",str2[i]);
}
}
