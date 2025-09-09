import sys

arr = []
for _ in range(9):
    row = list(map(int, sys.stdin.readline().split()))
    arr.append(row)

tmp = 0
first = 0
second = 0

for i in range(9):
    for j in range(9):
        if arr[i][j] > tmp:
            tmp = arr[i][j]
            first = i
            second = j
            
print(tmp)
print(first + 1, second + 1)