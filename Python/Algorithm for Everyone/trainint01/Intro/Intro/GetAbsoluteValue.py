'''
Created on 2018. 3. 1.

@author: kfx20
'''
import math #수학 모듈

# 절대값 알고리즘 부호 판단 

def abs_sign(a) :
    if a >= 0:
        return a
    else:
        return -a
    
    
# 절대값 알고리즘 제곱 제곱근

def abs_square(a):
    b = a * a
    return math.sqrt(b)


print(abs_sign(5))
print(abs_sign(-3))
print()
print(abs_square(5))
print(abs_square(-3))