// 하샤드 수 https://school.programmers.co.kr/learn/courses/30/lessons/12947

#include <stdbool.h>

bool solution(int x) {   
    
    int sum = 0;
    int n = x;

    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }

    return x % sum == 0 ? true : false;
    
}