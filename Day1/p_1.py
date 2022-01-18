'''
Write down a method boolean isNameValid(String name).
A name is valid if following conditions are satisfied:
• It does not contain any vowel more than once.
• If the name contains two ‘S’, then there is not any ‘T’ in between them (both in capital cases).

'''

def isNameValid(name: str):
    if len(name) == 0:
        return "String is empty"
    elif len(name) == 1:
        return True

    posFs = 0
    name_char_lst = []
    vowel_dict = {'a': 0,
                  'A': 0,
                  'e': 0,
                  'E': 0,
                  'i': 0,
                  'I': 0,
                  'o': 0,
                  'O': 0,
                  'u': 0,
                  'U': 0}
    for i in range(len(name)):
        if name[i] == 'a' or name[i] == 'A' or name[i] == 'e' or name[i] == 'E' or name[i] == 'i' or name[i] == 'I' or name[i] == 'o' or name[i] == 'O' or name[i] == 'u' or name[i] == 'U':
            vowel_dict[name[i]] += 1
            if vowel_dict[name[i]] > 1:
                return False


        if i > 1:
            name_char_lst.append(name[i - 1])
            if 'S' in name_char_lst and name[i] == 'S':
                for j in range(0, i):
                    if name[j] == 'S':
                        posFs = j

                for k in range(posFs, i):
                    if name[k] == 'T':
                        return False


    return True


# driver code
print("aSeCdS", isNameValid("aTSedSTS"))
print("aSeDdS", isNameValid("aSeDdSS"))
print("abeCdb", isNameValid("abeSdb"))
print("abecdbe", isNameValid("abecdbe"))
