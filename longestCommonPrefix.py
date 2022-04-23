from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        toReturn = ""
        # Get shortest word
        shortestWord = min(strs, key=len)

        # Return word if array has one item
        if len(strs) == 1:
            return strs[0]

        # Go through the letters of the shortest word
        for i in range(len(shortestWord)):
            
            # If all words in strs start with sub-array 0:i+1 from shortest word, update to return and go next
            if all(list(ma9p( lambda x: x.startswith(shortestWord[0:i+1]), strs))):
                toReturn = shortestWord[0:i+1]
            # Else, break and return what we have
            else:
                break

        return toReturn


sol = Solution()
print(sol.longestCommonPrefix(["flower","flow","flight"]))