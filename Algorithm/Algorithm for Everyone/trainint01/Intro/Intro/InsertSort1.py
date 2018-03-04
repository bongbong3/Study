'''
Created on 2018. 3. 4.

@author: kfx20
'''
# 쉬운 삽입 정렬

def find_ins_idx(r, v):
    for i in range(0, len(r)):
        if v < r[i]:
            return i
    return len(r)

def ins_sort(a):
    result = []
    while a:
        value = a.pop(0)
        ins_idx = find_ins_idx(result, value);
        result.insert(ins_idx, value)
    return result

d = [2, 4, 5, 1, 3]
print(ins_sort(d))