from typing import List
from itertools import product as pd

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        keys = {"2": ["a", "b", "c"], 
                "3": ["d", "e", "f"], 
                "4": ["g", "h", "i"], 
                "5": ["j", "k", "l"], 
                "6": ["m", "n", "o"], 
                "7": ["p", "q", "r", "s"], 
                "8": ["t", "u", "v"], 
                "9": ["w", "x", "y", "z"]
                }
        if digits == "":
            return ""
        toReturn = keys[digits[0]]
        for digit in digits[1:]:
            toReturn = [ i+j for i, j in pd(toReturn, keys[digit])]
        return toReturn


sol = Solution()
print(sol.letterCombinations("234"))
# a, b, c