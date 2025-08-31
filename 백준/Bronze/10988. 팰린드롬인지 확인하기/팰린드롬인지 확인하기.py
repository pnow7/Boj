import sys

word = list(sys.stdin.readline().strip())

if len(word) % 2 != 0:
    word.remove(word[len(word) // 2])

reversed_word = list(reversed(word))

if word == reversed_word:
    print(1)
else:
    print(0)