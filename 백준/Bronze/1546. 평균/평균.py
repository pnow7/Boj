import sys

N = int(sys.stdin.readline())

score = list(map(int, sys.stdin.readline().split()))

score_max = max(score)
score_average = (sum(score) / N * 100) / score_max

print(score_average)