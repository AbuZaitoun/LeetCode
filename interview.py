


def shift(letter, index):
    return chr(ord(letter)+index)

inputString = list("h3l4o3")

for i in range(0, len(inputString), 2):
    inputString[i+1] = shift(inputString[i], int(inputString[i+1]))

print(inputString)