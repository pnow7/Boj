import sys

T = int(sys.stdin.readline())

result = []

for _ in range(T):
    R, word = sys.stdin.readline().split()
    R = int(R)

    new_word =""
    for char in word:
        new_word += char * R
    
    result.append(new_word)

print('\n'.join(result))