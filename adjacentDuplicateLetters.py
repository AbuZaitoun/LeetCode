class Solution:
    def removeDuplicates(self, s: str) -> str:
        toReturn = s
        copy = s
        while True:
            for character in s: 
                toReturn = toReturn.replace(str(character)*2, "")

            if copy == toReturn:
                return toReturn 
            else:
                copy = toReturn

sol = Solution()
print(sol.removeDuplicates("abbaca"))