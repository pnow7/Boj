import sys

N = int(sys.stdin.readline())
count = 0

for _ in range(N):
    word = sys.stdin.readline().strip()
    group_word = True
    seen_chars = set()

    for i in range(len(word)):
        current_char = word[i]

        if i > 0 and current_char != word[i - 1]:
            if current_char in seen_chars:
                group_word = False
                break
        
        seen_chars.add(current_char)

    if group_word:
        count += 1

print(count)