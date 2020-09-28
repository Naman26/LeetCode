class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        dic = {}
        for i in s:
            if(i in dic):
                dic[i] +=1
            else:
                dic[s] = 1
        for lit in t:
            print(dic)
            if(lit in dic and dic[lit] > 0):
                print(dic[lit])
                dic[lit]-=1
            else:
                return False
        return True