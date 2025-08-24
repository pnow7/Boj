import sys

result = [-1] * (26)

word = sys.stdin.readline().strip()

order = 0

for i in range(0, len(word)):
    order = ord(word[i]) - 97
    if result[order] == -1:
        result[order] = i

print(*result)