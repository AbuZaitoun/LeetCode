items = [1, 2, 2, 2, 3, 4, 5, 6]
my_map = {}
for item in items:
    if item in my_map:
        my_map[item] = my_map[item] + 1
    else:
        my_map[item] = 1

print(max(my_map.values))


def valid_paranthesis():
    opening = ["{", "[", "("]
    closing = {"}": "{", "]": "[", ")":"("}

    my_input = '((()){{}}{}{{}[][]'
    my_stack = []
    for para in my_input:
        if para in opening:
            my_stack.append(para)
        else:
            if my_stack[-1] != closing[my_stack[-1]]:
                return False
    return True
