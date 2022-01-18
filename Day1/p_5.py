'''

Write a function Boolean isValidURL(String url)
eg url : https://www.google.com
         http://www.google.com

'''

def isValidUrl(url):
    check_1 = "https://www"
    check_2 = "http://www"
    # check_3 = "com"
    is_check_1 = True
    is_check_2 = True
    is_check_3 = True
    is_check_4 = True

    #  split by '.'
    check_1_lst = []
    check_2_lst = []
    check_3_lst = []

    # splitting the given Url
    counter = 0
    for i in range(len(url)):
        if counter == 0 :
            if url[i] != '.':
                check_1_lst.append(url[i])
            else:
                counter += 1
        elif counter == 1:
            if url[i] != '.':
                check_2_lst.append(url[i])
            else:
                counter += 1
        else:
            check_3_lst.append(url[i])

    print(check_1_lst, check_2_lst, check_3_lst)

    # check if the url is https
    if len(check_1) == len(check_1_lst):
        for i in range(len(check_1)):
            if check_1[i] == check_1_lst[i] :
                is_check_1 = True
            else:
                is_check_1 = False
                break
    else:
        is_check_1 = False

    # if the url is not https then check for the http
    if is_check_1 == False and len(check_2) == len(check_1_lst):
        for i in range(len(check_2)):
            if check_2[i] == check_1_lst[i]:
                is_check_2 = True
            else:
                is_check_2 = False
                break
    else:
        is_check_2 = False


    # check if mid part doesnot contain the special char: google
    for i in range(len(check_2_lst)):
        if (ord(check_2_lst[i]) >= 0 and ord(check_2_lst[i]) <= 46) or (ord(check_2_lst[i]) >= 58 and ord(check_2_lst[i]) <= 64) or (ord(check_2_lst[i]) >= 123 and ord(check_2_lst[i])<= 127):
            is_check_3 = False
            break

    # check for url end points: .com , .co.in
    for i in range(len(check_3_lst)):
        if ((ord(check_2_lst[i]) >= 0 and ord(check_2_lst[i]) <= 45) or (ord(check_2_lst[i]) >= 47 and ord(check_2_lst[i]) <= 64) or (ord(check_2_lst[i]) >= 123 and ord(check_2_lst[i])<= 127)):
            is_check_4 = False
            break



    # final check based on above three checks
    if (is_check_2 == True or is_check_1 == True) and is_check_3 == True and is_check_4 == True:
        return True
    else:
        return False



print("https://www.google.com", isValidUrl("ht.tps://www.google.com"))
print("http://www.google.com",  isValidUrl("http://www.google.com"))
print("http@://www.google.com", isValidUrl("http@://www.google.com"))
print("http://www.g@oogle.com", isValidUrl("http://www.g@oogle.com"))
print("https://www.goo@gle.com", isValidUrl("https://www.goo@gle.com"))
print("https://www.google.co.in", isValidUrl("https://www.google.co.in"))
print("http://www.google.co.in", isValidUrl("http://www.google.co.in"))



