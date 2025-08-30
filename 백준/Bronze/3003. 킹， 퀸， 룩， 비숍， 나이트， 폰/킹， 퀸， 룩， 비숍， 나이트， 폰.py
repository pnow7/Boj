import sys

chess = [1, 1, 2, 2, 2, 8]

my_piece = list(map(int, sys.stdin.readline().split()))

for i in range(0, len(my_piece)):
    chess[i] -= my_piece[i]

print(*chess)