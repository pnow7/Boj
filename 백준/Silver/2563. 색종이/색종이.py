import sys

n = int(sys.stdin.readline())
arr = [ [False] * 100 for _ in range(100) ]

for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())

    for i in range(x, x + 10):
        for j in range(y, y + 10):
            arr[i][j] = True

count = 0

for i in range(100):
    for j in range(100):
        if arr[i][j] == True:
            count += 1

print(count)