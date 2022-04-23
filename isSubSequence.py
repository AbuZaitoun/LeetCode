class Solution:
    def isSubsequence(self, original: str, target: str) -> bool:
        prev_index = 0
        for original_char in original:
            for index, target_char in enumerate(target):
                if original_char == target_char and prev_index >= index:
                    prev_index += 1
                    break
        if prev_index == len(target):
            return True
        return False


def isSubsequence(original: str, target: str) -> bool:
    # if target is bigger than original, return false
    if len(target) > len(original):
        return False

    # Start at char 0 in target string
    target_index = 0
    for original_char in original:
        # Check if chars are equal, add 1 if true
        if original_char == target[target_index]:
            target_index += 1
    # True if we iterated over all target chars
    return target_index == len(target)


print(isSubsequence('abcdef', 'acf'))

