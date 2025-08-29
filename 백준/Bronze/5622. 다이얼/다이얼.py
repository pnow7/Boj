import sys

word = sys.stdin.readline().strip()

time = 0

for char in word:
    if 'A' <= char <= 'C':
        time += 3  
    elif 'D' <= char <= 'F':
        time += 4  
    elif 'G' <= char <= 'I':
        time += 5  
    elif 'J' <= char <= 'L':
        time += 6
    elif 'M' <= char <= 'O':
        time += 7
    elif 'P' <= char <= 'S':
        time += 8  
    elif 'T' <= char <= 'V':
        time += 9
    elif 'W' <= char <= 'Z':
        time += 10 

print(time)