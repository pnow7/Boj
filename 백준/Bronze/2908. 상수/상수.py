import sys

A, B = sys.stdin.readline().split()

reversed_A_str = A[::-1]
reversed_B_str = B[::-1]

reversed_A = int(reversed_A_str)
reversed_B = int(reversed_B_str)

if reversed_A > reversed_B:
    print(reversed_A)
else:
    print(reversed_B)