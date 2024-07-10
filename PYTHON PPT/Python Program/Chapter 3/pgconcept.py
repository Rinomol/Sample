#...........if statement..........
"""n=3
if n>0:
    print( "Shaji", n, 'Shaji')
print("This is printed always.")"""
##n=-1
##if n<0:
##    print(n," is a positive number.")
##print("This is also printed always.")

#........if-else statement........
##n=5
##n <= 0:
##    print(n, "is positive or zero")
##else:
##        print(n, "is Negative Number")

#......elif statement...........
"""n=5
if n>0:
    print("Positive Number")
elif n == 5:
    print("Zero")
else:
    print("Negative Number")"""

#.......while loop......
"""count=0
#print(count)
while(count<9):
    #count +=1
    print('The Count is:', count)
    count +=1
print("Good bye!")"""

#.......else with while loop........
"""i=1
while i > 6:
#    i += 1
    print(i)
    i += 1
else:
    print("Condition false, else displays")"""

#........for loop........
"""numbers=[6,5,4,1,2,3,7,8,9]
sum=0
for var in numbers:
    sum=sum+var
    print("The sum is", sum)
#    sum=sum+val
print("\n The sum is", sum)"""

#..........range()...............
"""list = ['Apple', 'Orange' , 'Cherry']
for i in range(2):
    print("I like", list[i])"""

#...............else with for loop.................
"""digits = ['0','1','5']
print(digits)
for i in digits:
    print(i)
else:
    print("No items left.")"""

#...................nested for loop.........................
##adj = ["red", "big", "tasty"]
##fruits = ["apple", "banana", "cherry"]
##for x in adj:
##  for y in fruits:
##    print(x, y)

"""x = [1,2]
y = [4,5]
for i in x:
  for j in y:
    print(i, j)"""

##for i in range(1,3):
##    for j in range(1,11):
##        print(i, "*", j, "=", i*j)
##    print()

#............................nested while loop............................
"""x = [1,2]
y = [4,5]
i = 0
while i < len(x):
    j = 0
    while j < len(x):
        print(x[i], y[j])
        j+=1
    i+=1"""

##i = 1
##while i < 3:
##    j = 1
##    while j < 11:
##        print(i, "*", j, "=", i*j)
##        j+=1
##    i+=1
##    print()


#............................Continue ................................
##for var in "Geeksforgeeks":
##    if var == "e":
##        pass
##    print(var)

#....................Exercise.............................
##for i in range(10):
##    i += 1
##    if(i == 5):
##        print("5 is skipped")
##        continue
##    print('Number is ' + str(i))
##print("The End")


#....................Break....................
"""var = 10
while var>0:
    var-=1
    if var == 5:
        break
    print(var)
print("The End")"""


#.....................Pass...............................
##for letter in 'Python':
##    if letter == 'h':
##        pass
##        print ('This is pass block')
##    print ('Current Letter :', letter)
##print ("Good bye!")


"""numbers = [ 1, 2, 4, 3, 6, 5, 7, 10, 9 ]
for number in numbers:
    if(number % 2==0):
        #print(number)
        pass
    #print(number)
    else:
        print('Current number is:', number)"""







    




