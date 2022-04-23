from typing import List
from itertools import product as pd

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        rightSide = ['(']*n
        leftSide = [')']*n

        while len(rightSide) > 0 and len(leftSide) > 0:
            break


'''
output: (((()))), ()()()(), (()(())), ((())()), ((()())), ()((())), ()(()())
Input: 3 (2^(3-1) + 1 = 5)
output: ((())), (()()), ()()(), ()(()), (())()

Input: 2 (2^(2-1) + 1 = 3)
output: ()(), (()), ()()
'''

sol = Solution()
print(sol.generateParenthesis(3))