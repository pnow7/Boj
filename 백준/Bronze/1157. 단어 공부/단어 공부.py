import sys
from collections import Counter

word = sys.stdin.readline().strip().upper()

count_dict = Counter(word)

if not count_dict:
    print('?')
else:
    max_value = max(count_dict.values())

    most_common_letters = [k for k, v in count_dict.items() if v == max_value]

    if len(most_common_letters) > 1:
        print('?')
    else:
        print(most_common_letters[0])