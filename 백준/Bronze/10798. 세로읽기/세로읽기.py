import sys

word = [ list(sys.stdin.readline().strip()) for _ in range(5) ]

result_string = ""

for j in range(15):
    for i in range(5):
        if len(word[i]) > j:
            result_string += word[i][j] 

print(result_string)