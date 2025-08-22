import sys

remain_list = []

for _ in range(10):
    num = int(sys.stdin.readline())
    num %= 42
    remain_list.append(num)

result = set(remain_list)

print(len(result))