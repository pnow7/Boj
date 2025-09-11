import sys
import string

alpha_dict = {
    char: ord(char) - 55 for char in string.ascii_uppercase
}

for i in range(10):
    alpha_dict[str(i)] = i

B, N = sys.stdin.readline().split()
N = int(N)

result = 0
length = len(B)
reversed_B = reversed(B)

for i, char in enumerate(reversed_B):
    val = alpha_dict[char]
    result += val * (N ** i)

print(result)