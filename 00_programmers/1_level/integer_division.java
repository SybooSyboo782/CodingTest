// 정수 나눗셈 https://school.programmers.co.kr/learn/courses/30/lessons/12931

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    
    int answer = 0;
    
    while(n > 0) {
        answer += n%10;
        n /= 10;
    }
    
    return answer;
}