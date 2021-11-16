from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        toReturn = ""
        minIndex = strs.index(min(strs, key=len))

        if len(strs) == 1:
            return strs[0]

        for i in range(len(strs[minIndex])):

            if all(list(map( lambda x: x.startswith(strs[minIndex][0:i+1]), strs))):
                toReturn = strs[minIndex][0:i+1]
            else:
                break

        return toReturn


sol = Solution()
print(sol.longestCommonPrefix(["flower","flow","flight"]))