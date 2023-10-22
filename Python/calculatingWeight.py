weight = float(input("Weight : "))
value = input("(K)g or (L)bs : ").lower()
if value == 'k':
    print("Weight in Lbs is " + str("{:.1f}".format((weight/0.45))))
else:
    print("Weight in Kg is " + str("{:.1f}".format(weight*0.45)))