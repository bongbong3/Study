'''
Created on 2018. 3. 11.

@author: kfx20
'''
# 그래프 탐색 : 너비 우선 탐색
# 입력 : 그래프 g, 탐색 시작점 start
# 출력 : start에서 출발해 연결된 꼭짓점들을 출력

def bfs(g, start):
    qu = [] # 기억 장소 1 : 앞으로 처리해야 할 꼭짓점을 큐에 저장
    done = set() # 기억 장소 2 : 이미 큐에 추가한 꼭짓점들을 집합에 기록(중복 방지)
    
    qu.append(start)    # 시작점을 큐에 넣고
    done.add(start)     # 집합에도 추가
    
    while qu:
        p = qu.pop(0)   # 큐에 처리해야 할 꼭짓점이 남아 있으면 큐에서 처리 대상을 꺼내어
        print(p)        # 꼭짓점 이름을 출력하고
        for x in g[p]:  # 대상 꼭짓점에 연결된 꼭짓점 중에
            if x not in done :  # 아직 큐에 추가된 적이 없는 꼭짓점들을
                qu.append(x)    # 큐에 추가하고
                done.add(x)     # 집합에도 추가
                
g = {
    1 : [2, 3],
    2 : [1, 4, 5],
    3 : [1],
    4 : [2],
    5 : [2]
    }

bfs(g, 1)