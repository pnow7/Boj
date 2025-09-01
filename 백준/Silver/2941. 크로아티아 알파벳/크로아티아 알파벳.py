import sys

word = sys.stdin.readline().strip()
croatian_alph = ['dz=', 'lj', 'nj', 'c=', 'c-', 'd-', 's=', 'z=']

for char in croatian_alph:
    word = word.replace(char, 'a')

print(len(word))