from math import floor, log

tree = [3, 5, 7, 'null', 'null', 3, 10]


level = 0
summation = tree[0]
count = 1
averages = []
for index, element in enumerate(tree):
    if isinstance(element, str):
        continue

    if level == floor(log(index + 1)):
        summation+=element
        count+=1
        averages[level] = averages[level]
    else:
        averages.append(summation/count)
        summation = element
        level += 1
        count += 1

print(averages)


# 0 -> 1
# 1 -> 2, 3
# 2 -> 4, 5, 6, 7
# 3 -> 8, 9, 10, 11, 12, 13, 14, 15
