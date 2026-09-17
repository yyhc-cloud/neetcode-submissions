class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""

        return "".join(f"{len(item)}#{item}" for item in strs)

    #2#ASD
    def decode(self, s: str) -> List[str]:
        res = []
        i = 0

        while i < len(s):
            delimiterIndex = s.index('#', i)
            length = int(s[i : delimiterIndex])
            start = delimiterIndex + 1
            end = start + length

            res.append(s[start: end])
            i = end

        return res
        

