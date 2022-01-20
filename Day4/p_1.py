'''
1.  Make a StringUtils class which contains following methods
NOTE: You can use only String.charAt(), methods to code this problem.(Don't use any other inbuilt functions)
• static int countChar(String str,char ch)
• - Returns occurrence of the given character in the given String (str).
• static String substring(String str,int start,int end)
• - Returns a substring from the start index to end index with all validation checks.
• static String[] split(String str,char ch)
• - Returns an array of strings broken according to the occurrence of the given character with validation checks.
• static Boolean hasPattern(String str,String pattern)
• - Returns true if the give string (pattern) found in the main string (str) otherwise false.
• static Boolean allWordsContainsChar(String str,char ch)
• - Returns true if all words of the given string (str) contains the given character (ch)  otherwise false.
• static String reverse(String str)
• - Returns the reverse of the String (Without using extra String or array)
• static String reverseVowels(String str)
• - Reverse only all the vowels in the string and return it ( Example :
• Input: s = "liipcoce"
Output: "leopcici"
• Input: s = "hello"
• Output: "holle"
)

'''

class StrUtitlity:

    def countChar(self, givenStr: str, givenChar: str):
        counter = 0
        for i in range(len(givenStr)):
            if givenStr[i] == givenChar:
                counter += 1
        return counter

    def subString(self, givenStr: str, start: int, end: int):
        subStr = ""
        if len(givenStr) > 0:
            if start <= end:
                if start >= 0 and end < len(givenStr):
                    for i in range(start, end+1):
                        subStr += givenStr[i]

            else:
                if start < len(givenStr) and end >= 0:
                    for i in range(start, end-1, -1 ):
                        subStr += givenStr[i]


        return subStr

    def splittingString(self, givenStr: str, givenCh: str):
        splitArray = []
        splittedStr = ""
        for i in range(len(givenStr)):
            if givenStr[i] != givenCh:
                splittedStr += givenStr[i]

            else:
                splitArray.append(splittedStr)
                splittedStr = ""

        return splitArray


    def hasPattern(self, givenStr: str, pattern: str):
        i = 0
        while i < len(givenStr) - len(pattern) + 1:
            j = 1
            subStr = ""
            if givenStr[i] == pattern[0]:
                subStr += givenStr[i]
                while j < len(pattern):
                    if givenStr[i+j] != pattern[j]:
                        break
                    else:
                        subStr += givenStr[i+j]

                    j += 1
                if subStr == pattern:
                    # print("matched:", subStr, pattern)
                    return True
            i+=1
        return False

    def doesAllWordHaveChar(self, givenStr: str, givenChar: str):
        splitArray = self.splittingString(givenStr, " ")
        # print(splitArray)
        for i in range(len(splitArray)):
            hasChar = False
            for j in range(len(splitArray[i])):
                if splitArray[i][j] == givenChar:
                    hasChar = True

            if hasChar == False:
                return hasChar

        return True


    def reverseString(self, givenStr: str):
        revStr = ""
        if len(givenStr) > 1:
            for i in range(len(givenStr)-1, -1, -1):
                revStr += givenStr[i]
        else:
            return givenStr

        return revStr


    def reverseVowel(self, givenStr: str):
        start, end = 0, len(givenStr)-1
        # split the string
        charArray = []
        for i in range(len(givenStr)):
            charArray.append(givenStr[i])
        # print(charArray)


        while start < end:
            if (charArray[start] == "a" or charArray[start] == "e" or charArray[start] == "i" or charArray[start] == "o" or charArray[start] == "u") and \
                (charArray[end] == "a" or charArray[end] == "e" or charArray[end] == "i" or charArray[end] == "o" or charArray[end] == "u"):
                # swap
                temp = charArray[start]
                charArray[start] = charArray[end]
                charArray[end] = temp

                start += 1
                end -= 1

            elif (charArray[start] == "a" or charArray[start] == "e" or charArray[start] == "i" or charArray[start] == "o" or charArray[start] == "u") and \
                    (charArray[end] != "a" or charArray[end] != "e" or charArray[end] != "i" or charArray[end] != "o" or charArray[end] != "u"):

                end -= 1

            elif (charArray[start] != "a" or charArray[start] != "e" or charArray[start] != "i" or charArray[start] != "o" or charArray[start] != "u") and \
                    (charArray[end] == "a" or charArray[end] == "e" or charArray[end] == "i" or charArray[end] == "o" or charArray[end] == "u"):

                start += 1

            else:
                start += 1
                end -= 1

        finalStr = ""
        for i in range(len(charArray)):
            finalStr += charArray[i]

        return finalStr


obj = StrUtitlity()

print("Counting given Char's occurrence:", obj.countChar("this is a Sample string", "i"))

# taking 0th index
print("SubString:", obj.subString("this is a Sample string", 1, 10))
# print(len("this is a Sample string")) #23

print("Split Array:", obj.splittingString("this is a Sample string", "i"))

print("Check each word has a specific char: ", obj.doesAllWordHaveChar("this is its Ai if", "i"))
print("Check each word has a specific char: ", obj.doesAllWordHaveChar("this as its Ai if", "i"))


print("Reverse String:", obj.reverseString("this is a Sample string"))

print("Revese Vowel:", obj.reverseVowel("liipcoce"))
print("Revese Vowel:", obj.reverseVowel("hello"))
print("Revese Vowel:", obj.reverseVowel("aedoi"))


print("pattern match: ", obj.hasPattern("abcde", "bcd"))
print("pattern match: ", obj.hasPattern("abcdeefghi", "ghi"))
print("pattern match: ", obj.hasPattern("abcdedfsferg", "fsfe"))
print("pattern match: ", obj.hasPattern("abcdsadfaefewq", "abcds"))
print("pattern match: ", obj.hasPattern("abcdsadfaefewq", "abcde"))