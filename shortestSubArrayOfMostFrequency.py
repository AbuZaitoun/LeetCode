

input_array = [1, 2, 3, 4, 2, 2, 4, 2, 5]

numbers_dictionary = {}

for index, number in enumerate(input_array):
    # Check if element doesn't exist, add its index as array
    if numbers_dictionary.get(number) == None:
        numbers_dictionary[number] = [index]
    else:
        # If element exists, add index to the array
        numbers_dictionary[number] = numbers_dictionary[number] + [index]

# Get the longest array in dictionary
target = max(numbers_dictionary.values(), key=len)
# Calculate length of longest array
print(target[-1] - target[0] + 1)

