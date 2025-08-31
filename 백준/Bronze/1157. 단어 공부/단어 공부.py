import sys

word = list(sys.stdin.readline().strip().upper())

alpa = [0] * 26

for items in word:
    alpa[ord(items) - ord('A')] += 1

max_value = max(alpa)
find_most_used_alpa = alpa.count(max_value)

if find_most_used_alpa >= 2:
    print('?')
else:
    print(chr(alpa.index(max_value) + ord('A')))