class Solution:
    def isPalindrome(self, s: str) -> bool:
        charArray = list(s.lower())

        left = 0
        right = len(charArray) - 1

        while left < right:
            if charArray[left].isalnum() and charArray[right].isalnum():

                if charArray[left] != charArray[right]:
                    return False

                else:
                    left += 1
                    right -= 1

            elif not charArray[left].isalnum():
                left += 1
                
            else:
                right -= 1

        return True
