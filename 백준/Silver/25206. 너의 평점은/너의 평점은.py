def grade_cal(value):
    if value == 'A+':
        return 4.5
    elif value == 'A0':
        return 4.0
    elif value == 'B+':
        return 3.5
    elif value == 'B0':
        return 3.0
    elif value == 'C+':
        return 2.5
    elif value == 'C0':
        return 2.0
    elif value == 'D+':
        return 1.5
    elif value == 'D0':
        return 1.0
    else:
        return 0.0

import sys
    
sum = 0
total_sum = 0

for _ in range(20):
    input_data = sys.stdin.readline().split()

    sub_name = input_data[0]
    score = float(input_data[1])
    grade = input_data[2]

    if grade == 'P':
        continue
    else:
        sum += grade_cal(grade) * score
        total_sum += score

print(sum / total_sum)