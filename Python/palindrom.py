a = "Madam"
b = a.lower()
print(b)
if b[::-1]==b:
    print("The given string is Palindrome")
else:
    print("Not a Palindrome")

tup = (10,20,30,40,60)
print(tup[1:4])